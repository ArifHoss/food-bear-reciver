package com.foodbear.foodbear.service;

import com.foodbear.foodbear.entities.FoodBearUser;
import com.foodbear.foodbear.repo.FoodBearUserDaoJpa;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@AllArgsConstructor
@Service("foodBearUserService")
public class FoodBearUserService {

    private FoodBearUserDaoJpa foodBearUserDaoJpa;

    public List<FoodBearUser> getAllUsers() {
        return foodBearUserDaoJpa.findAll();
    }

    public FoodBearUser createUser(FoodBearUser foodBearUser) {
        return foodBearUserDaoJpa.save(foodBearUser);
    }

    public void deleteUser(Long id) {
        foodBearUserDaoJpa.deleteById(id);
    }
}
