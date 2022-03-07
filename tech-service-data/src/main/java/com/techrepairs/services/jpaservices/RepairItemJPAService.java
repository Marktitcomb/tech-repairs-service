package com.techrepairs.services.jpaservices;

import com.techrepairs.domain.RepairItem;
import com.techrepairs.repositories.RepairItemRepository;
import com.techrepairs.services.interfaces.RepairItemService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RepairItemJPAService implements RepairItemService {

    RepairItemRepository repairItemRepository;

    public RepairItemJPAService(RepairItemRepository repairItemRepository){
        this.repairItemRepository = repairItemRepository;
    }
    @Override
    public Set<RepairItem> findAll() {
        Set<RepairItem> repairItems = new HashSet<>();
        repairItemRepository.findAll().forEach(repairItems::add);
        return repairItems;
    }

    @Override
    public RepairItem findById(Long id) {
        return repairItemRepository.findById(id).orElse(null);
    }

    @Override
    public RepairItem save(RepairItem repairItem) {
        return repairItemRepository.save(repairItem);
    }

    @Override
    public void delete(RepairItem repairItem) {
        repairItemRepository.delete(repairItem);
    }

    @Override
    public void deleteById(Long id) {
        repairItemRepository.deleteById(id);
    }
}
