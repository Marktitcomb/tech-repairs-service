package com.techrepairsdata.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class RepairItem extends BaseEntity{

    @Column(name = "item_descrption")
    private String itemDescription;
    /**
     * Mapping this back to owners and saying how it joins
     * */
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    public RepairItem(Long id, String itemDescripton, Owner owner){
        super(id);
        this.itemDescription = itemDescripton;
    }
}
