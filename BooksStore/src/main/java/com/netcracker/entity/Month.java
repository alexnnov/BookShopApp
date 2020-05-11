package com.netcracker.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "purchases")
public class Month {

    @Id
    @Column(name = "date")

    private double month;


}