package com.foodbear.foodbear.repo;

import com.foodbear.foodbear.entities.FoodBearUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodBearUserRepo extends JpaRepository<FoodBearUser, Long> {
}
