package com.springframeworkguru.springframeworkgurumsscbrewery.services.impl;

import com.springframeworkguru.springframeworkgurumsscbrewery.services.BeerService;
import com.springframeworkguru.springframeworkgurumsscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //Will implement later
        log.debug("Updating Beer");
    }

    @Override
    public void deleteById(UUID beerId) {
    log.debug("Deleting a beer");
    }
}
