package com.techrepairs.services;

import com.techrepairs.domain.RepairItem;
import com.techrepairs.repositories.RepairItemRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class ItemServiceImpl implements TechService {

    @Autowired
    private RepairItemRepository repairItemRepository;

    @Override
    public void save(RepairItem item){
        repairItemRepository.save(item);
    }
}
