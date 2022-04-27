package com.foodbear.foodbear.repo;

import com.foodbear.foodbear.entities.FoodBearUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("foodBearUserDaoJpa")
public interface FoodBearUserDaoJpa extends JpaRepository<FoodBearUser, Long> {
}
