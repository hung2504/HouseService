package com.example.houseservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class House implements Serializable {

    private String name;
    private double price;
    private String description;

    public int getCost(){
        return 0;
    }
    private String getName(){
        return name;
    }
    private String getDescription(){
        return description;
    }
}
