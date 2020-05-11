package com.netcracker.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="extended_purchases")
public class PurchaseCustomerShop {
    @Id
    private int id;
    private String bookname;
    private int number;
    private String lastname;
    private String shop;
}
