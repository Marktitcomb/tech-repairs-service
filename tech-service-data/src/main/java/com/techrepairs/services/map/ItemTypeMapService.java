package com.techrepairs.services.map;

import com.techrepairs.domain.ItemType;
import com.techrepairs.services.interfaces.CRUDService;
import com.techrepairs.services.interfaces.ItemTypeService;

import java.util.Set;

public class ItemTypeMapService extends AbstractMapService<ItemType, Long> implements ItemTypeService {
    @Override
    public Set<ItemType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(ItemType itemType) {
        super.delete(itemType);
    }

    @Override
    public ItemType save(ItemType itemType) {
        return super.save(itemType);
    }

    @Override
    public ItemType findById(Long id) {
        return super.findbyid(id);
    }
}
