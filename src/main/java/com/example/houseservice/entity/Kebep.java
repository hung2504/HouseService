package com.example.houseservice.entity;

public class Kebep extends NoiThatDecorator{
    private String name;
    public Kebep(Apartment apartment) {
        super(apartment);
    }

    @Override
    public int getCost() {
        return apartment.getCost() + 25;
    }
    @Override
    public String getDescription() {
        return apartment.getDescription() + " "+getName();
    }

}
