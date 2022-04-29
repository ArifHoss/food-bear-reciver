package com.foodbear.foodbear.repo;

import com.foodbear.foodbear.entities.FoodItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("FoodItemDaoJpa")
public interface FoodItemDaoJpa extends CrudRepository<FoodItem, Long> {
}
