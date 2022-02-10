package com.cloudbeds.assignment.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@Data
@Builder
public class UserDto {
    private final Long id;

    @NotNull(message = "First Name cannot be empty")
    private final String firstName;

    @NotNull(message = "Last Name cannot be empty")
    private final String lastName;

    @NotNull(message = "Email cannot be empty")
    @Pattern(regexp = "^(.+)@(.+)$", message = "Please verify that email is valid")
    private final String email;

    @NotNull(message = "Password cannot be empty")
    private final String password;

    private final List<AddressDto> addresses;
}
