package com.netcracker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Customers")
public class Customer {
    @Id
    private int id;
    private String lastname;
    private String distrinct;
    private int sale;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", distrinct='" + distrinct + '\'' +
                ", sale=" + sale +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDistrinct() {
        return distrinct;
    }

    public void setDistrinct(String distrinct) {
        this.distrinct = distrinct;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public Customer() {
    }

    public Customer(int id, String lastname, String distrinct, int sale) {
        this.id = id;
        this.lastname = lastname;
        this.distrinct = distrinct;
        this.sale = sale;
    }
}
