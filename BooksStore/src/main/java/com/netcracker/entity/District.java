package com.netcracker.entity;

import org.springframework.context.annotation.Primary;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class District {
    @Id
    private String district;

    @Override
    public String toString() {
        return "District{" +
                "district='" + district + '\'' +
                '}';
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public District() {
    }

    public District(String district) {
        this.district = district;
    }
}
