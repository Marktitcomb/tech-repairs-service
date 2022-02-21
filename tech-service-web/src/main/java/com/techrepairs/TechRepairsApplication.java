package com.techrepairs;

import com.techrepairs.domain.RepairItem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//steps to check the boot strap entries in the h2 database



//@SpringBootApplication
//@ComponentScan({"com.techrepairsdata", "com.techrepairs"})
//@SpringBootApplication(scanBasePackages = {"com.techrepairsdata", "com.techrepairs"})
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class TechRepairsApplication {

	public static void main(String[] args) {


		SpringApplication.run(TechRepairsApplication.class, args);

		//ApplicationContext context = SpringApplication.run(TechRepairsApplication.class, args);

		//RepairItem item = (RepairItem) context.getBean("repairItem");

		RepairItem item = new RepairItem();
        item.setItemDescription("Iphone 4");

		//RepairItemRepository repairItemRepository = (RepairItemRepository) context.getBean("repairItemRepository");

		//repairItemRepository.save(item);


		System.out.println("hello");
		System.out.println(item.getItemDescription());
	}

}
