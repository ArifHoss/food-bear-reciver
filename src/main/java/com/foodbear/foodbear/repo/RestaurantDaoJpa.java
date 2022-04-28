package com.foodbear.foodbear.repo;

import com.foodbear.foodbear.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("restaurantDaoJpa")
public interface RestaurantDaoJpa extends JpaRepository<Restaurant, Long> {

}
