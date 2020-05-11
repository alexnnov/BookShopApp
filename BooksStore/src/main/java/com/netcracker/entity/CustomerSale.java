package com.netcracker.entity;

import lombok.Data;
import org.hibernate.validator.constraints.ISBN;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "customer")
public class CustomerSale {
    @Id
    private int id;
    private String lastname;
    private int sale;


}
