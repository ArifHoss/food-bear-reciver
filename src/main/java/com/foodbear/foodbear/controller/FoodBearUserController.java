package com.foodbear.foodbear.controller;

import com.foodbear.foodbear.entities.FoodBearUser;
import com.foodbear.foodbear.entities.UserAddress;
import com.foodbear.foodbear.service.FoodBearUserService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
@Data
@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/user")
public class FoodBearUserController {

    private final FoodBearUserService foodBearUserService;
    //private UserAddress userAdressService;

    @GetMapping
    public List<FoodBearUser> getAllUsers(){
        return foodBearUserService.getAllUsers();
    }

    @GetMapping("{id}")
    public FoodBearUser findUserById(@PathVariable Long id){
        return foodBearUserService.findUserById(id);
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
