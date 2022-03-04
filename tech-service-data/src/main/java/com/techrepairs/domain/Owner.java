package com.techrepairs.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity //because we want this to be an actual table
@Table(name = "owners")
public class Owner extends Person{

    @Column(name = "postcode")
    private String postcode;

    @Column(name = "house_number")
    private int houseNumber;

    @Column(name = "phone_num")
    private String telephone;

    /**
     *The meaning of CascadeType.ALL is that the persistence will propagate (cascade)
     * all EntityManager operations (PERSIST, REMOVE, REFRESH, MERGE, DETACH) to the
     * relating entities.
     *
     * It seems in your case to be a bad idea, as removing an Address would lead to
     * removing the related User. As a user can have multiple addresses, the other
     * addresses would become orphans.
     *
     * Mapped by corresponds to the value in the RepairItem class
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<RepairItem> items = new HashSet<>();

    public Owner(Long id, String firstName, String lastName, String postcode, int houseNumber, String telephone, Set<RepairItem> items){
        super(id, firstName, lastName);
        this.postcode = postcode;
        this.houseNumber = houseNumber;
        this.telephone = telephone;

        if(items !=  null){
            this.items = items;
        }
    }

    public Set<RepairItem> getRepairItems(){
        return items;
    }

    public RepairItem getItemById(Long id){
        return items.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .get();
    }
}
