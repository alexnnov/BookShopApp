package com.netcracker.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "shops")
@Data

public class Shops {

    @Id
    private int id;
    private String name;
    private String district;
    private int comission;
}
