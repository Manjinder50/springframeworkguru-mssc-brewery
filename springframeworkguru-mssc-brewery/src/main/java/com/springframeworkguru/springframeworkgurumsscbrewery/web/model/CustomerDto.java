package com.springframeworkguru.springframeworkgurumsscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDto {

    private UUID customerId;
    private String name;
}
