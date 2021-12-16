package com.example.houseservice.entity;

public class NoiThatDecorator implements House{

    protected Apartment apartment;

    public NoiThatDecorator(Apartment apartment) {
        this.apartment = apartment;
    }

    @Override
    public int getCost() {
        return apartment.getCost();
    }

    @Override
    public String getName() {
        return apartment.getName();
    }

    @Override
    public String getDescription() {
        return apartment.getDescription();
    }
}
