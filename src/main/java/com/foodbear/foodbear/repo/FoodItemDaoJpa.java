package com.foodbear.foodbear.repo;

import com.foodbear.foodbear.entities.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("FoodItemDaoJpa")
public interface FoodItemDaoJpa extends JpaRepository<FoodItem, Long> {
}
