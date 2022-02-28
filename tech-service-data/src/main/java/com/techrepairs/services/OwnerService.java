package com.techrepairs.services;

import com.techrepairs.domain.Owner;

import java.util.Set;

public interface OwnerService extends CRUDService<Owner, Long>{

    Owner findByLastName(String lastName);

    Set<Owner> findAll();
}
