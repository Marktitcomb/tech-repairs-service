package com.techrepairs.repositories;

import com.techrepairs.domain.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long>{}

