package com.foodbear.foodbear.controller;

import com.foodbear.foodbear.entities.FoodBearOrder;
import com.foodbear.foodbear.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@AllArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/order")
public class OrderController {

    private OrderService orderService;

    @GetMapping
    public List<FoodBearOrder> getAllOrders(){
        return orderService.getAllOrder();
    }

    @PostMapping
    public FoodBearOrder createOrder(@RequestBody FoodBearOrder foodBearOrder){
        return orderService.createOrder(foodBearOrder);
    }
/*

    @GetMapping("/newOrders")
        public String orderReciever(){
        return orderService.recieveNewOrders();
    }
*/


    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable("id")Long id){
        orderService.deleteOrder(id);
    }
    @PatchMapping("/{id}")
    public void updateOrder(@PathVariable("id")Long id, @RequestBody FoodBearOrder foodBearOrder){
        orderService.updateOrder(id, foodBearOrder);
    }
}
