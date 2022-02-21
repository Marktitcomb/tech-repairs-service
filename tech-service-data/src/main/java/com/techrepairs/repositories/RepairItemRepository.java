package com.techrepairs.repositories;

import com.techrepairs.domain.RepairItem;
import org.springframework.data.repository.CrudRepository;

public interface RepairItemRepository extends CrudRepository<RepairItem, Long> {
}
