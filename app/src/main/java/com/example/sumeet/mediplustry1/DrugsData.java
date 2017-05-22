package com.example.sumeet.mediplustry1;

/**
 * Created by Sumeet on 20-05-2017.
 */

public class DrugsData {

    int id;
    String name;
    String description;
    String price;

    //Default Constructor
    public DrugsData() {
    }

    public DrugsData(int id, String name, String description, String price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
