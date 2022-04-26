package com.foodbear.foodbear.service;

import com.foodbear.foodbear.entities.FoodBearUser;
import com.foodbear.foodbear.repo.FoodBearUserRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@AllArgsConstructor
@Service
public class FoodBearUserService {

    private FoodBearUserRepo foodBearUserRepo;

    public List<FoodBearUser> getAllUsers() {
        return (List<FoodBearUser>) foodBearUserRepo.findAll();
    }
}
