package com.techrepairs.domain;


import lombok.AllArgsConstructor;

@AllArgsConstructor
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
