package com.techrepairs.repositories;

import com.techrepairs.domain.Repair;
import org.springframework.data.repository.CrudRepository;

public interface RepairRepository extends CrudRepository<Repair, Long> {
}
