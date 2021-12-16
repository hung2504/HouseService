package com.example.houseservice.service;

import com.example.houseservice.entity.Apartment;
import com.example.houseservice.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartmentService {

    @Autowired
    private ApartmentRepository apartmentRepository;

    public Apartment saveApartment(Apartment apartment){
        return apartmentRepository.save(apartment);
    }

    public List<Apartment> getAllApartment(){
        return apartmentRepository.findAll();
    }

    public void deleteApartment(Long id){
        apartmentRepository.deleteById(id);
    }

    public void updateApartment(Apartment apartment){
        apartmentRepository.saveAndFlush(apartment);
    }
}
