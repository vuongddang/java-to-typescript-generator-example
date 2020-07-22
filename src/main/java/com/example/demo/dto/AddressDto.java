package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@ToString
public class AddressDto {
    @JsonProperty(required = true)
    private AddressType type;

    @JsonProperty(required = true)
    private String streetAddress;

    @JsonProperty(required = true)
    private String city;
    private String state;
}
