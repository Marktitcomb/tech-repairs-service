package com.techrepairs.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "repair_items")
public class RepairItem extends BaseEntity{

    @Column(name = "item_descrption")
    private String itemDescription;

//    @Enumerated(EnumType.ORDINAL)
//    private Type type;
    /**
     * Mapping this back to owners and saying how it joins
     * */
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "repairItem")
    private Set<Repair> repair = new HashSet<>();

    public RepairItem(Long id, String itemDescripton, Owner owner){
        super(id);
        this.itemDescription = itemDescripton;
    }
}
