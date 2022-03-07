package com.techrepairs.services.jpaservices;

import com.techrepairs.domain.Repair;
import com.techrepairs.repositories.RepairRepository;
import com.techrepairs.services.interfaces.RepairService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RepairJPAService implements RepairService {

    RepairRepository repairRepository;

    public RepairJPAService(RepairRepository repairRepository){
        this.repairRepository = repairRepository;
    }

    @Override
    public Set<Repair> findAll() {
        Set<Repair> repairs = new HashSet<>();
        repairRepository.findAll().forEach(repairs::add);
        return repairs;
    }

    @Override
    public Repair findById(Long id) {
        return repairRepository.findById(id).orElse(null);
    }

    @Override
    public Repair save(Repair repair) {
        return repairRepository.save(repair);
    }

    @Override
    public void delete(Repair repair) {
        repairRepository.delete(repair);
    }

    @Override
    public void deleteById(Long id) {
        repairRepository.deleteById(id);
    }
}
