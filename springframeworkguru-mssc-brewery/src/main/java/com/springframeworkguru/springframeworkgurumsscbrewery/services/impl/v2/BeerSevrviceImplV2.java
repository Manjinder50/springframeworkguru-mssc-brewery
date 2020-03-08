package com.springframeworkguru.springframeworkgurumsscbrewery.services.impl.v2;

import com.springframeworkguru.springframeworkgurumsscbrewery.services.v2.BeerServiceV2;
import com.springframeworkguru.springframeworkgurumsscbrewery.web.model.BeerDto;
import com.springframeworkguru.springframeworkgurumsscbrewery.web.model.v2.BeerDtoV2;
import com.springframeworkguru.springframeworkgurumsscbrewery.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerSevrviceImplV2 implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.ALE)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDtoV2) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDtoV2) {
        //Will implement later
        log.debug("Updating Beer");
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer");
    }
}
