package com.netcracker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchases")
public class Purchase {
    @Id
    private int id;
    private String date;
    private int seller;
    private int customer;
    private int book;
    private int number;
    private int summary;

    public Purchase(int id, String date, int seller, int customer, int book, int number, int summary) {
        this.id = id;
        this.date = date;
        this.seller = seller;
        this.customer = customer;
        this.book = book;
        this.number = number;
        this.summary = summary;
    }

    public Purchase() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSeller() {
        return seller;
    }

    public void setSeller(int seller) {
        this.seller = seller;
    }

    public int getCustomer() {
        return customer;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public int getBook() {
        return book;
    }

    public void setBook(int book) {
        this.book = book;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSummary() {
        return summary;
    }

    public void setSummary(int summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", seller=" + seller +
                ", customer=" + customer +
                ", book=" + book +
                ", number=" + number +
                ", summary=" + summary +
                '}';
    }
}
