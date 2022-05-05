package com.foodbear.foodbear.service;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.foodbear.foodbear.entities.FoodBearOrder;
import com.foodbear.foodbear.reciever.OrderReciever;
import com.foodbear.foodbear.repo.OrderDaoJpa;
import com.foodbear.foodbear.sender.Sender;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Queue;

@Data
@AllArgsConstructor
@Service("orderService")
public class OrderService {

    private OrderDaoJpa orderDaoJpa;

    private JmsTemplate jmsTemplate;



    public List<FoodBearOrder> getAllOrder() {
        return orderDaoJpa.findAll();
    }

    public FoodBearOrder createOrder(FoodBearOrder foodBearOrder) {
        Sender.sendMessage();
        return orderDaoJpa.save(foodBearOrder);
    }

    public void deleteOrder(Long id) {
        orderDaoJpa.deleteById(id);
    }

    public void updateOrder(Long id, FoodBearOrder foodBearOrder) {
        FoodBearOrder foundOrder = orderDaoJpa.getById(id);

        orderDaoJpa.save(foundOrder);
    }
/*
    public String recieveNewOrders() {
        return OrderReciever.orderListener();
    }*/
}
