package com.example.houseservice.entity;

public class Tivi extends NoiThatDecorator{
    private String name;
    public Tivi(Apartment apartment) {
        super(apartment);
    }
    @Override
    public int getCost() {
        return apartment.getCost() + 15;
    }
    @Override
    public String getDescription() {
        return apartment.getDescription() + " "+getName();
    }
}
