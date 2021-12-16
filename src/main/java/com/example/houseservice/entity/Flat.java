package com.example.houseservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

public class Flat extends House{

    public Flat() {
    }

    @Override
    public int getCost() {
        return super.getCost();
    }
}
