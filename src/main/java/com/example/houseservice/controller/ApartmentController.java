package com.example.houseservice.controller;

import com.example.houseservice.entity.Apartment;
import com.example.houseservice.repository.RedisReporitory;
import com.example.houseservice.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApartmentController {

    @Autowired
    private ApartmentService apartmentService;

    @Autowired
    private RedisReporitory redisReporitory;

    @GetMapping("/")
    public List<Apartment> getAllApartment(){
        if(redisReporitory.findAll() != null){
            return redisReporitory.findAll();
        }
        return apartmentService.getAllApartment();
    }
    @PostMapping("/")
    public Apartment saveApartment(@RequestBody Apartment apa){
        redisReporitory.saveApart(apa);
        return apartmentService.saveApartment(apa);
    }
    @DeleteMapping("/{id}")
    public void deleteApartment(@PathVariable("id") Long apaId){
        redisReporitory.delete(apaId);
        apartmentService.deleteApartment(apaId);
    }
}
