package com.foodbear.foodbear.repo;

import com.foodbear.foodbear.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("orderDaoJpa")
public interface OrderDaoJpa extends JpaRepository<Order, Long> {

}
