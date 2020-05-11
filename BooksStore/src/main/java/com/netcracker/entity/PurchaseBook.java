package com.netcracker.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "books")
@SecondaryTable(name = "purchases",pkJoinColumns = @PrimaryKeyJoinColumn(name = "book"))
public class PurchaseBook {
    @Id
    @Column(name = "id", table = "purchases")
    private int id;
    @Column(name = "name", table = "books")
    private String name;
    @Column(name = "number", table = "books")
    private int number;
}
