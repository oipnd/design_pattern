package com.principle.openclose;

public class GolangDiscoutCourse extends GolangCourse {

    public GolangDiscoutCourse(String name, int id, double price) {
        super(name, id, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }

    public double getOriginPrice() {
        return super.getPrice();
    }
}
