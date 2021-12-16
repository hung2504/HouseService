package com.example.houseservice.controller;

import com.example.houseservice.entity.Apartment;
import com.example.houseservice.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApartmentController {

    @Autowired
    private ApartmentService apartmentService;

    @GetMapping("/")
    public List<Apartment> getAllApartment(){
        return apartmentService.getAllApartment();
    }
    @PostMapping("/")
    public Apartment saveApartment(@RequestBody Apartment apa){
        return apartmentService.saveApartment(apa);
    }
    @DeleteMapping("/{id}")
    public void deleteApartment(@PathVariable("id") Long apaId){
        apartmentService.deleteApartment(apaId);
    }
}
