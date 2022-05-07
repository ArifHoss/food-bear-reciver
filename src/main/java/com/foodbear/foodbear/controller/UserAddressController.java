package com.foodbear.foodbear.controller;

import com.foodbear.foodbear.entities.UserAddress;
import com.foodbear.foodbear.service.UserAddressService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@AllArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/address")
public class UserAddressController {

    private UserAddressService userAddressService;

    @GetMapping
    public List<UserAddress> getAllAddress(){
        return userAddressService.getAllAddress();
    }
    @GetMapping("/{id}")
    public UserAddress getAddressById(@PathVariable Long id){
        return userAddressService.getAddressById(id);
    }

    @PostMapping
    public UserAddress create(@RequestBody UserAddress userAddress){
        return userAddressService.createAddress(userAddress);
    }

    @PatchMapping("/{id}")
    public UserAddress update(@PathVariable Long id, @RequestBody UserAddress userAddress){
        return userAddressService.update(id, userAddress);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        return userAddressService.delete(id);
    }
}
