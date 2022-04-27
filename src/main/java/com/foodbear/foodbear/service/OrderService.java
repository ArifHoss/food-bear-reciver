package com.foodbear.foodbear.service;

import com.foodbear.foodbear.entities.Order;
import com.foodbear.foodbear.repo.OrderDaoJpa;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@AllArgsConstructor
@Service("orderService")
public class OrderService {

    private OrderDaoJpa orderDaoJpa;

    public List<Order> getAllOrder() {
        return orderDaoJpa.findAll();
    }
}
