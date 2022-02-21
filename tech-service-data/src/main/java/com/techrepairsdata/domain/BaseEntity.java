package com.techrepairsdata.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
/**
 * @MappedSupperclass is different than the @Inheritance annotation.
 *
 * @MappedSuperclass tells the JPA provider to include the base class
 * persistent properties as if they were declared by the child class
 * extending the superclass annotated with @MappedSuperclass.
 * */
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
