package com.techrepairs.bootstrap;

import com.techrepairs.domain.Owner;
import com.techrepairs.domain.Repair;
import com.techrepairs.domain.RepairItem;
import com.techrepairs.services.jpaservices.OwnerJPAService;
import com.techrepairs.services.jpaservices.RepairItemJPAService;
import com.techrepairs.services.jpaservices.RepairJPAService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Very important, when doing multi module make sure the package name is the same else spring boot
 * wont pick it up!!!!!!!!!!!!!!!!
 *
 * I think CommandLine runner must use the default in package check
 *
 * This is why it wasnt working
 *
 *
 * */

@Component
public class BootStrap implements CommandLineRunner {

    private final OwnerJPAService ownerJPAService;
    private final RepairJPAService repairJPAService;
    private final RepairItemJPAService repairItemJPAService;

    Logger logger = LoggerFactory.getLogger(BootStrap.class);


    public BootStrap(OwnerJPAService ownerJPAService, RepairJPAService repairJPAService, RepairItemJPAService repairItemJPAService){
        this.ownerJPAService = ownerJPAService;
        this.repairJPAService = repairJPAService;
        this.repairItemJPAService = repairItemJPAService;

    }


    @Override
    public void run(String... args) throws Exception {

        Owner owner = new Owner();
        owner.setPostcode("BH2325H");
        owner.setTelephone("07565665757");
        owner.setPostcode("BH234GD");
        owner.setLastName("Smith");
        owner.setFirstName("Steve");
        owner.setHouseNumber(29);

        RepairItem repairItem = new RepairItem();
        repairItem.setItemDescription("Randon repair");
        repairItem.setOwner(owner);

        owner.getItems().add(repairItem);

        ownerJPAService.save(owner);
        repairItemJPAService.save(repairItem);
//        Repair repairJob = new Repair();
//        repairJob.setCost(33);
//
//        repairItem.getRepair().add(repairJob);
//        repairJob.setRepairItem(repairItem);
//
//        repairJPAService.save(repairJob);
//        repairItemJPAService.save(repairItem);
//


        System.out.println("owner and single repair item loaded in");
        logger.info("owner and single repair item loaded in");
        logger.info("repair item id: " + repairItem.getId() + " owner: " + repairItem.getOwner()
                + " Description: " + repairItem.getItemDescription());

    }
}
