package com.principle.openclose;

public class GolangCourse implements ICourse {


    private String name;
    private int id;
    private double price;

    public GolangCourse(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }


    public Integer getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}
