package com.techrepairs;

import com.techrepairs.domain.RepairItem;
import com.techrepairs.repositories.RepairItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RepairItemService {

    private RepairItemRepository repairItemRepository;


    @Autowired
    public RepairItemService(RepairItemRepository repairItemRepository){
        this.repairItemRepository = repairItemRepository;
    }

    public RepairItem saveToRepo(RepairItem repairItem){
        return repairItemRepository.save(repairItem);
    }
}
