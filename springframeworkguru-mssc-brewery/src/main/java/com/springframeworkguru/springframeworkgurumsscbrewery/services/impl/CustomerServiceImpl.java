package com.springframeworkguru.springframeworkgurumsscbrewery.services.impl;

import com.springframeworkguru.springframeworkgurumsscbrewery.services.CustomerService;
import com.springframeworkguru.springframeworkgurumsscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getByCustomerId(UUID customerId) {
        return CustomerDto.builder().customerId(UUID.randomUUID()).name("John").build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().customerId(UUID.randomUUID()).build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //Will implement later
        log.debug("Updating customer");
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting customer...");
    }
}
