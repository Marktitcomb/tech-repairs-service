package com.techrepairs.services.map;

import com.techrepairs.services.interfaces.RepairItemService;
import com.techrepairs.domain.RepairItem;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RepairItemMapService extends AbstractMapService<RepairItem, Long> implements RepairItemService {


    @Override
    public Set<RepairItem> findAll() {
        return super.findAll();
    }

    @Override
    public RepairItem findById(Long id){
        return super.findbyid(id);
    }

    @Override
    public void delete(RepairItem repairItem) {
        super.delete(repairItem);
    }

    @Override
    public void deleteById(Long id){
        super.deleteById(id);
    }

    @Override
    public RepairItem save(RepairItem repairItem) {
        return super.save(repairItem);
    }

}
