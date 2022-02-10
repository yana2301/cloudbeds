package com.cloudbeds.assignment.service;

import com.cloudbeds.assignment.model.AddressDto;
import com.cloudbeds.assignment.model.UserDto;
import com.cloudbeds.assignment.repository.UserRepository;
import com.cloudbeds.assignment.repository.model.Address;
import com.cloudbeds.assignment.repository.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
public class UserService {
    public static final String USER_WITH_ID_S_NOT_FOUND = "User with id %s not found";
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public UserDto getUser(Long userId) {
        try {
            validateUserExistense(userId);
            Optional<UserDto> dbUser = userRepository.findById(userId).map(this::toApiModel);
            return dbUser.orElseThrow(() -> new IllegalArgumentException(String.format("User with id %s does not exist ", userId)));
        } catch (Exception e) {
            throw new IllegalArgumentException(String.format("Failed to find user with id %s", userId));
        }
    }

    public Long createUser(UserDto userDto) {
        User user = toDBModel(userDto);
        try {
            return userRepository.save(user).getId();
        } catch (Exception e) {
            log.error("Failed to save user first name: {}, last name: {} because of error", userDto.getFirstName(), userDto.getLastName(), e);
            throw new IllegalStateException("Failed to save user because of error " + e.getMessage());
        }
    }

    public void updateUser(Long id, UserDto userDto) {
        validateUserExistense(id);
        User user = toDBModel(userDto);
        user.setId(id);
        try {
            userRepository.save(user);
        } catch (Exception e) {
            log.error("Failed to save user first name: {}, last name: {} because of error", userDto.getFirstName(), userDto.getLastName(), e);
            throw new IllegalStateException("Failed to save user because of error " + e.getMessage()
            );
        }
    }

    public void deleteUser(Long id) {
        validateUserExistense(id);
        try {
            userRepository.deleteById(id);
        } catch (Exception e) {
            log.error("Failed to delete user id {} because of error", id, e);

            throw new IllegalStateException(String.format("Failed to delete user %s ", id));
        }
    }

    public List<UserDto> findUsersByCountry(String country) {
        List<User> users = userRepository.findUsersByCountry(country);
        return users == null ? Collections.emptyList() : users.stream().map(this::toApiModel).collect(Collectors.toList());
    }

    private void validateUserExistense(Long userId) {
        if (!userRepository.existsById(userId)) {
            throw new IllegalArgumentException(String.format(USER_WITH_ID_S_NOT_FOUND, userId));
        }
    }

    private UserDto toApiModel(User dbUser) {
        List<AddressDto> addresses = dbUser.getAddress() == null
                ? null
                : dbUser.getAddress().stream().map(this::toApiModel).collect(Collectors.toList());

        return UserDto.builder()
                .id(dbUser.getId())
                .firstName(dbUser.getFirstName())
                .lastName(dbUser.getLastName())
                .email(dbUser.getEmail())
                .password(passwordEncoder.encode(dbUser.getPassword()))
                .addresses(addresses)
                .build();
    }

    private User toDBModel(UserDto apiUser) {
        List<Address> addresses = apiUser.getAddresses() == null
                ? null
                : apiUser.getAddresses().stream().map(this::toDBModel).collect(Collectors.toList());

        User user = User.builder()
                .email(apiUser.getEmail())
                .firstName(apiUser.getFirstName())
                .lastName(apiUser.getLastName())
                .password(apiUser.getPassword())
                .address(addresses)
                .build();
        if (addresses != null) {
            addresses.forEach(addr -> addr.setUser(user));
        }
        return user;
    }

    private Address toDBModel(AddressDto apiAddress) {
        return Address.builder()
                .addressLine1(apiAddress.getAddressLine1())
                .addressLine2(apiAddress.getAddressLine2())
                .city(apiAddress.getCity())
                .state(apiAddress.getState())
                .country(apiAddress.getCountry())
                .zipCode(apiAddress.getZipCode())
                .build();

    }

    private AddressDto toApiModel(Address dbAddress) {
        return AddressDto.builder()
                .addressLine1(dbAddress.getAddressLine1())
                .addressLine2(dbAddress.getAddressLine2())
                .city(dbAddress.getCity())
                .state(dbAddress.getState())
                .country(dbAddress.getCountry())
                .zipCode(dbAddress.getZipCode())
                .build();
    }
}
