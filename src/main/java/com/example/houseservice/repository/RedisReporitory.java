package com.example.houseservice.repository;

import com.example.houseservice.entity.Apartment;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RedisReporitory {
    private HashOperations hashOperations;
    private RedisTemplate redisTemplate;

    public RedisReporitory(RedisTemplate redisTemplate){
        this.hashOperations = redisTemplate.opsForHash();
        this.redisTemplate = redisTemplate;
    }
    public void saveApart(Apartment apa){
        hashOperations.put("APARTMENT", apa.getApartmentId(), apa);
    }


    public List<Apartment> findAll(){
        return (List<Apartment>) hashOperations.values("APARTMENT");
    }

    public void update(Apartment apa){
        saveApart(apa);
    }

    public Apartment findById(Long id){
        return (Apartment) hashOperations.get("APARTMENT", id);
    }

    public void delete(Long id){
        hashOperations.delete("APARTMENT", id);
    }
}
