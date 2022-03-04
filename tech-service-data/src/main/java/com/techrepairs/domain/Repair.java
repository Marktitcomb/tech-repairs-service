package com.techrepairs.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "repairs")
public class Repair extends BaseEntity{

    //time
    //cost
    //date
    @Column(name = "cost")
    private int cost;

    @Column(name = "checkin_date")
    private Date checkinDate;

    @Column(name = "estimated_completed")
    private Date estimatedCompletion;

    //each repair job is for a single item hence the one to one relation
    // the tables are conected by the repair items id
    @OneToOne
    @JoinColumn(name = "repairItem_id")
    private RepairItem repairItem;

}
