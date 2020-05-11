package com.netcracker.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@Table(name = "Customers")
public class Customer {
    @Id
    private int id;
    private String lastname;
    private String distrinct;
    private int sale;


}
