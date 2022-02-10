package com.cloudbeds.assignment.model;

import lombok.Builder;
import lombok.Value;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

@Value
@Builder
public class AddressDto {
    @NotNull(message = "Address line 1 cannot be empty")
    String addressLine1;

    String addressLine2;

    @NotNull(message = "City cannot be empty")
    String city;

    @NotNull(message = "State cannot be empty")
    String state;

    @NotNull(message = "Zip code cannot be empty")
    String zipCode;

    @NotNull(message = "Country cannot be empty")
    String country;

}
