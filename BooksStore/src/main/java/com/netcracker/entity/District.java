package com.netcracker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class District {
    @Id
    private int id;
    private String district;

    @Override
    public String toString() {
        return "District{" +
                "id=" + id +
                ", district='" + district + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public District() {
    }

    public District(int id, String district) {
        this.id = id;
        this.district = district;
    }
}
