package com.netcracker.entity;

import javax.persistence.*;

@Entity
@Table(name = "shops")

public class Shops {

    @Id
    private int id;
    private String name;
    private String district;
    private int comission;

    public Shops() {
    }

    public Shops(int id, String name, String district, int comission) {
        this.id = id;
        this.name = name;
        this.district = district;
        this.comission = comission;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getComission() {
        return comission;
    }

    public void setComission(int comission) {
        this.comission = comission;
    }

    @Override
    public String toString() {
        return "Shops{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", district='" + district + '\'' +
                ", comission=" + comission +
                '}';
    }
}
