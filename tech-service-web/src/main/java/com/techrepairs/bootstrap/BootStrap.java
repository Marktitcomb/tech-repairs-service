package com.techrepairs.bootstrap;

import com.techrepairsdata.domain.Owner;
import com.techrepairsdata.domain.RepairItem;
import com.techrepairsdata.repositories.OwnerRepository;
import com.techrepairsdata.repositories.RepairItemRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
//public class BootStrap implements CommandLineRunner {
//
//    private final RepairItemRepository repairItemRepository;
//    private final OwnerRepository ownerRepository;
//
//    Logger logger = LoggerFactory.getLogger(BootStrap.class);
//
//    public BootStrap(RepairItemRepository repairItemRepository, OwnerRepository ownerRepository){
//        this.ownerRepository = ownerRepository;
//        this.repairItemRepository = repairItemRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        RepairItem item = new RepairItem();
//        item.setItemDescription("Iphone 4");
//
//        repairItemRepository.save(item);
//
//        Owner owner = new Owner();
//        owner.getItems().add(item);
//        owner.setTelephone("07565665757");
//        owner.setPostcode("BH234GD");
//
//        ownerRepository.save(owner);
//
//        System.out.println("owner and single repair item loaded in");
//        logger.info("owner and single repair item loaded in");
//
//    }
//}
