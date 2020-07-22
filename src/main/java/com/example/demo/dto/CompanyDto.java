package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
@ToString
public class CompanyDto {
    private Long id;

    @JsonProperty(required = true)
    private String name;

    private List<AddressDto> addresses;
}
