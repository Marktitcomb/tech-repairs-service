package com.techrepairs.services;

import com.techrepairs.domain.RepairItem;

import java.util.Set;

public interface RepairItemService extends CRUDService<RepairItem, Long> {

    RepairItem findById(Long id);

    Set<RepairItem> findAll(Long id);
}
