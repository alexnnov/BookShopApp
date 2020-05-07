package com.netcracker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchases")
public class Mounth {
    @Id
    private int id;
    private int mounth;

    @Override
    public String toString() {
        return "Mounth{" +
                "id=" + id +
                ", mounth=" + mounth +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMounth() {
        return mounth;
    }

    public void setMounth(int mounth) {
        this.mounth = mounth;
    }

    public Mounth() {
    }

    public Mounth(int id, int mounth) {
        this.id = id;
        this.mounth = mounth;
    }
}
