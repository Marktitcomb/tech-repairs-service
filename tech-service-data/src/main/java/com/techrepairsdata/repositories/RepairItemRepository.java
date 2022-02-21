package com.techrepairsdata.repositories;

import com.techrepairsdata.domain.RepairItem;
import org.springframework.data.repository.CrudRepository;

public interface RepairItemRepository extends CrudRepository<RepairItem, Long> {
}
