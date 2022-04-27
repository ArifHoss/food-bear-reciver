package com.foodbear.foodbear.controller;

import com.foodbear.foodbear.entities.Order;
import com.foodbear.foodbear.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Data
@AllArgsConstructor
@RestController
@RequestMapping("/order")
public class OrderController {

    private OrderService orderService;

    @GetMapping
    public List<Order> getAllOrders(){
        return orderService.getAllOrder();
    }

}
