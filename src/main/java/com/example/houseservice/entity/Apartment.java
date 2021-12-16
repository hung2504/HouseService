package com.example.houseservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Apartment implements House{

    @Id
    @GeneratedValue
    private Long apartmentId;
    private String name;

    private double price;
    private String description;

    @Override
    public int getCost() {
        return 0;
    }
}
