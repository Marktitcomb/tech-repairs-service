package com.techrepairs;

import com.techrepairsdata.domain.RepairItem;
import com.techrepairsdata.repositories.RepairItemRepository;
import javafx.scene.canvas.GraphicsContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//issue: having problem scanning both modules
//solution: rewatch the udemy video on splitting the application
//when using context it's still just using the default context from spring boot, cant find things in the other module

@SpringBootApplication
@ComponentScan({"com.techrepairsdata", "com.techrepairs"})
//@SpringBootApplication(scanBasePackages = {"com.techrepairsdata", "com.techrepairs"})
public class TechRepairsApplication {

	public static void main(String[] args) {


		//SpringApplication.run(TechRepairsApplication.class, args);

		ApplicationContext context = SpringApplication.run(TechRepairsApplication.class, args);

		//RepairItem item = (RepairItem) context.getBean("repairItem");

		RepairItem item = new RepairItem();
        item.setItemDescription("Iphone 4");

		RepairItemRepository repairItemRepository = (RepairItemRepository) context.getBean("repairItemRepository");

		repairItemRepository.save(item);


		System.out.println("hello");
		System.out.println(item.getItemDescription());
	}

}
