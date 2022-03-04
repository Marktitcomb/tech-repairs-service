package com.techrepairs.domain;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "item_type")
public class ItemType extends BaseEntity{


    private Type itemType;
    private String avgRepairCost;
    private String postageCosts;

    public ItemType(Type itemType, String avgRepairCost){
        this.avgRepairCost = avgRepairCost;
        this.itemType = itemType;
    }

    public String toString(){
        return itemType.toString();
    }

}
