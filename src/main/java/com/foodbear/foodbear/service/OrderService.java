package com.foodbear.foodbear.service;

import com.foodbear.foodbear.entities.FoodBearOrder;
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

    public List<FoodBearOrder> getAllOrder() {
        return orderDaoJpa.findAll();
    }

    public FoodBearOrder createOrder(FoodBearOrder foodBearOrder) {
        return orderDaoJpa.save(foodBearOrder);
    }

    public void deleteOrder(Long id) {
        orderDaoJpa.deleteById(id);
    }

    public void updateOrder(Long id, FoodBearOrder foodBearOrder) {
        FoodBearOrder foundOrder = orderDaoJpa.getById(id);

        orderDaoJpa.save(foundOrder);
    }
}
