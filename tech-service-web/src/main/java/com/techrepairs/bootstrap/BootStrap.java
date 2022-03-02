package com.techrepairs.bootstrap;

import com.techrepairs.domain.Owner;
import com.techrepairs.domain.RepairItem;
import com.techrepairs.repositories.*;
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

    private final RepairItemRepository repairItemRepository;
    private final OwnerRepository ownerRepository;
    private final ItemServiceImpl service;

    Logger logger = LoggerFactory.getLogger(BootStrap.class);


    public BootStrap(ItemServiceImpl service, RepairItemRepository repairItemRepository, OwnerRepository ownerRepository){
        this.service = service;
        this.ownerRepository = ownerRepository;
        this.repairItemRepository = repairItemRepository;

    }


    @Override
    public void run(String... args) throws Exception {
        RepairItem item = new RepairItem();
        item.setItemDescription("Iphone 4");

        //repairItemRepository.save(item);

        Owner owner = new Owner();
        owner.setPostcode("BH2325H");
        owner.getItems().add(item);
        owner.setTelephone("07565665757");
        owner.setPostcode("BH234GD");

        //logger.info(ownerRepository.save(owner).getPostcode());
        //output the item name here
        Owner owner2 = ownerRepository.save(owner);
        Set<RepairItem> items = (Set<RepairItem>) owner2.getItems();

        /**
         * Remember how to do things with sets!!!!!!!!!!!!!!!!!!!!!
         * */
        RepairItem[] itemsArray = items.toArray(new RepairItem[items.size()]);
        logger.info(itemsArray[0].getItemDescription());

        System.out.println("owner and single repair item loaded in");
        logger.info("owner and single repair item loaded in");

    }
}
