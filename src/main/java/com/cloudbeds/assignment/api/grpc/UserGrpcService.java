package com.cloudbeds.assignment.api.grpc;

import com.cloudbeds.assignment.grpc.model.Address;
import com.cloudbeds.assignment.grpc.model.User;
import com.cloudbeds.assignment.model.AddressDto;
import com.cloudbeds.assignment.model.UserDto;
import com.cloudbeds.assignment.service.UserService;
import org.lognet.springboot.grpc.GRpcService;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@GRpcService
public class UserGrpcService implements DataProtocol {
    private final UserService userService;

    public UserGrpcService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public User getUser(long id) {
        UserDto userDto = userService.getUser(id);
        return toUser(userDto);
    }

    @Override
    public long createUser(User user) {
        return userService.createUser(toUserDto(user));
    }

    @Override
    public void updateUser(long id, User user) {
        userService.updateUser(id, toUserDto(user));
    }

    @Override
    public void deleteUser(long id) {
        userService.deleteUser(id);
    }

    @Override
    public List<User> findUsers(String country) {
        List<UserDto> users = userService.findUsersByCountry(country);
        return users == null ? Collections.emptyList()
                : users.stream().map(this::toUser).collect(Collectors.toList());
    }

    private Address toAddress(AddressDto addressDto) {
        return new Address(addressDto.getAddressLine1(),
                addressDto.getAddressLine2(),
                addressDto.getCity(),
                addressDto.getState(),
                addressDto.getZipCode(),
                addressDto.getCountry());
    }

    private User toUser(UserDto userDto) {
        List<Address> addresses = userDto.getAddresses() == null
                ? Collections.emptyList()
                : userDto.getAddresses().stream().map(this::toAddress).collect(Collectors.toList());
        return new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail(),
                userDto.getPassword(),
                addresses);

    }

    private UserDto toUserDto(User user) {
        List<AddressDto> addresses = user.getAddresses() == null ?
                Collections.emptyList()
                : user.getAddresses().stream().map(this::toAddressDto).collect(Collectors.toList());

        return UserDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .password(user.getPassword())
                .addresses(addresses)
                .build();
    }

    private AddressDto toAddressDto(Address address) {
        return AddressDto.builder()
                .addressLine1(address.getAddressLine1())
                .addressLine2(address.getAddressLine2())
                .city(address.getCity())
                .state(address.getState())
                .zipCode(address.getZipcode())
                .country(address.getCountry())
                .build();
    }
}
