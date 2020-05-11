package com.netcracker.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "purchases")
public class Purchase {
    @Id
    private int id;
    private String date;
    private int seller;
    private int customer;
    private int book;
    private int number;
    private int summary;


}
