package com.techrepairs.services.map;


import com.techrepairs.domain.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OwnerMapServiceTest {

    //1. the thing you need to be testing
    OwnerMapService ownerMappingService;

    final long ownerId = 3L;
    final String lastName = "Smith";

    @BeforeEach
    void setup(){
        ownerMappingService = new OwnerMapService();
        ownerMappingService.save(new Owner(ownerId, "Mike",
                lastName, "BH12", 22, "07565665858", null));
    }

    @Test
    void findAll(){
        assert(ownerMappingService.findAll().size() == 1);
    }

    @Test
    void findById(){
        Owner owner = ownerMappingService.findById(ownerId);
        Long ownerIDFromRepo = owner.getId();
        assert(owner.getLastName().equals(lastName));
    }




}
