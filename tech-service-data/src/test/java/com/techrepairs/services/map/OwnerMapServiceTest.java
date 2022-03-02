package com.techrepairs.services.map;


import com.techrepairs.domain.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    @Test
    void save(){
        Owner ownerToSave = new Owner();
        ownerToSave.setId(ownerId + 1);
        ownerToSave.setLastName(lastName);
        Owner savedOwner = ownerMappingService.save(ownerToSave);
        assert(savedOwner.getId().equals(ownerId + 1));
        assert(ownerMappingService.map.size() == 2);
    }

    @Test
    void delete(){
        Owner ownerToDelete = ownerMappingService.findbyid(ownerId);
        ownerMappingService.delete(ownerToDelete);
        assert(ownerMappingService.map.size() == 0);
    }




}
