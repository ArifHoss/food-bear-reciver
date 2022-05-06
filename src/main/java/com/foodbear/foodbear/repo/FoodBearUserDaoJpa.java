package com.foodbear.foodbear.repo;

import com.foodbear.foodbear.entities.FoodBearUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("foodBearUserDaoJpa")
public interface FoodBearUserDaoJpa extends CrudRepository<FoodBearUser, Long> {
    FoodBearUser findByEmail(String email);

    boolean existsByEmail(String email);

    @Query("SELECT f.email FROM FoodBearUser f")
    List<String> existingEmail();

}
