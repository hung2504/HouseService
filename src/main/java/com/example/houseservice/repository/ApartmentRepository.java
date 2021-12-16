package com.example.houseservice.repository;

import com.example.houseservice.entity.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;

public interface ApartmentRepository extends JpaRepository<Apartment, Long> {


}
