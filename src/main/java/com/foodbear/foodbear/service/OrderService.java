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

    public Order createOrder(Order order) {
        return orderDaoJpa.save(order);
    }

    public void deleteOrder(Long id) {
        orderDaoJpa.deleteById(id);
    }

    public void updateOrder(Long id, Order order) {
        Order foundOrder = orderDaoJpa.getById(id);

        orderDaoJpa.save(foundOrder);
    }
}
