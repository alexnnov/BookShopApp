package com.netcracker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shops")
public class ShopDistrict {
    @Id
    private int id;
    private String name;

    public ShopDistrict(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ShopDistrict{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public ShopDistrict() {
    }
}
