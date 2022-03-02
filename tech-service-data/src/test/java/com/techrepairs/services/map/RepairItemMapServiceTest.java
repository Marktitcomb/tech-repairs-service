package com.techrepairs.services.map;

import com.techrepairs.domain.RepairItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class RepairItemMapServiceTest {

    @Mock
    private RepairItemMapService repairItemMapService;

    private Long id = 1L;
    private String itemDescription = "Test Item";


    @BeforeEach
    void init(){
        repairItemMapService = new RepairItemMapService();
        RepairItem repairItem = new RepairItem();
        repairItem.setId(1L);
        repairItemMapService.save(new RepairItem(id, itemDescription, null));
    }

    @Test
    void save(){
        RepairItem repairItem = repairItemMapService.save(new RepairItem(4L, itemDescription, null));
        assert(repairItem.getId() == 4L);
        assert(repairItemMapService.map.size() == 2);
    }

    @Test
    void findAll(){
        assert(repairItemMapService.findAll().size() == 1);
    }

    @Test
    void findById(){
        assert(id.equals(repairItemMapService.findbyid(id).getId()));
    }

    @Test
    void deleteById(){
        repairItemMapService.deleteById(1L);
        assert(repairItemMapService.map.size() == 0);
    }

    @Test
    void delete(){
        RepairItem repairItem = new RepairItem(id, itemDescription, null);
        repairItemMapService.delete(repairItem);
        assert(repairItemMapService.map.size() == 0);
    }

}
