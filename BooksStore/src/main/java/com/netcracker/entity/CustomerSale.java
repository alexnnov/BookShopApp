package com.netcracker.entity;

import org.hibernate.validator.constraints.ISBN;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerSale {
    @Id
    private int id;
    private String customer;
    private int sale;

    public CustomerSale(int id, String customer, int sale) {
        this.id = id;
        this.customer = customer;
        this.sale = sale;
    }

    @Override
    public String toString() {
        return "CustomerSale{" +
                "id=" + id +
                ", customer='" + customer + '\'' +
                ", sale=" + sale +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public CustomerSale() {
    }
}
