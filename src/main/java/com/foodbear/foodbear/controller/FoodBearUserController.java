package com.foodbear.foodbear.controller;

import com.foodbear.foodbear.entities.FoodBearUser;
import com.foodbear.foodbear.service.FoodBearUserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
@Data
@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class FoodBearUserController {

    private FoodBearUserService foodBearUserService;

    @GetMapping
    public List<FoodBearUser> getAllUsers(){
        return foodBearUserService.getAllUsers();
    }

    @PostMapping
    public  FoodBearUser createUser(@RequestBody FoodBearUser foodBearUser){
        return foodBearUserService.createUser(foodBearUser);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id")Long id){
        foodBearUserService.deleteUser(id);
    }
    @PatchMapping("/{id}")
    public void updateUser(@PathVariable("id") Long id, @RequestBody FoodBearUser foodBearUser){
        foodBearUserService.updateUser(id, foodBearUser);
    }
}
