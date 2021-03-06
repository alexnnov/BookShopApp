package com.netcracker.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "books")
public class Book {
    @Id
    private int id;
    private String name;
    private int price;
    private int warehouse;
    private int number;


}
