package com.foodbear.foodbear.controller;

import com.foodbear.foodbear.entities.Order;
import com.foodbear.foodbear.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Order createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable("id")Long id){
        orderService.deleteOrder(id);
    }
    @PatchMapping("/{id}")
    public void updateOrder(@PathVariable("id")Long id, @RequestBody Order order){
        orderService.updateOrder(id, order);
    }
}
