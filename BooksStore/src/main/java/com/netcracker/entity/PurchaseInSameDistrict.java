package com.netcracker.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="customers")
@SecondaryTable(name="purchases",pkJoinColumns = @PrimaryKeyJoinColumn(name="customer"))
public class PurchaseInSameDistrict {
    @Id
    @Column(name="id",table="purchases")
    private int id;
    @Column(name="date",table = "purchases")
    private String date;
    @Column(name="lastname",table="customers")
    private String lastname;
    @Column(name="district",table="customers")
    private String district;


}
