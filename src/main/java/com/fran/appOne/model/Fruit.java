package com.fran.appOne.model;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FRUIT")
public class Fruit {

    @Id
    private int id;
    private int price;
    private String name;

    public Fruit() {
    }

    public Fruit(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public Fruit(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
