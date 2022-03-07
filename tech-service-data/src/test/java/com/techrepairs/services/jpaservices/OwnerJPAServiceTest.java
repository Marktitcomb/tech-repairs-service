package com.techrepairs.services.jpaservices;

import com.techrepairs.domain.Owner;
import com.techrepairs.repositories.OwnerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class OwnerJPAServiceTest {

    @Mock
    OwnerRepository ownerRepository;

    @InjectMocks
    OwnerJPAService ownerJPAService;

    Owner returnOwner;

    @BeforeEach
    void setup(){
        returnOwner = new Owner();
        returnOwner.setLastName("Smith");
        returnOwner.setPostcode("BH12");
    }

    @Test
    void findById(){
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));
        Owner owner = ownerJPAService.findById(1L);
        assert(owner != null);
    }

    @Test
    void findAll(){
        Set<Owner> allOwners = new HashSet<>();
        allOwners.add(returnOwner);
        when(ownerRepository.findAll()).thenReturn(allOwners);
        assertEquals(1, ownerJPAService.findAll().size());
    }

    //All you do here is verify that it only gets called once
    @Test
    void deleteByid(){
        ownerJPAService.delete(returnOwner);
        verify(ownerRepository, times(1)).delete(returnOwner);
    }

}
