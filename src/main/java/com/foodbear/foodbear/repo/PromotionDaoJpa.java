package com.foodbear.foodbear.repo;

import com.foodbear.foodbear.entities.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("promotionDaoJpa")
public interface PromotionDaoJpa extends JpaRepository <Promotion, Long> {

}
