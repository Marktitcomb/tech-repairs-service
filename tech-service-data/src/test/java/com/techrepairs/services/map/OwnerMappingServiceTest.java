package com.techrepairs.services.map;


import com.techrepairs.domain.Owner;
import com.techrepairs.domain.RepairItem;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OwnerMappingServiceTest {

    //1. the thing you need to be testing
    OwnerMappingService ownerMappingService;

    final long ownerId = 3L;
    final String lastName = "Smith";

    @BeforeEach
    void setup(){
        ownerMappingService = new OwnerMappingService();
        ownerMappingService.save(new Owner(ownerId, "Mike",
                "Smith", "BH12", 22, "07565665858", null));
    }

    @Test
    void findAll(){
        assert(ownerMappingService.findAll().size() == 1);
    }


}
