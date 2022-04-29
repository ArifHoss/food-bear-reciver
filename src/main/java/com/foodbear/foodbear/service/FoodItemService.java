package com.foodbear.foodbear.service;

import com.foodbear.foodbear.entities.FoodBearUser;
import com.foodbear.foodbear.entities.FoodItem;
import com.foodbear.foodbear.entities.Restaurant;
import com.foodbear.foodbear.repo.FoodItemDaoJpa;
import com.foodbear.foodbear.repo.RestaurantDaoJpa;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@AllArgsConstructor
@Service("foodItemService")
public class FoodItemService {

    private FoodItemDaoJpa foodItemDaoJpa;
    private RestaurantDaoJpa restaurantDaoJpa;

    public List<FoodItem> getAllFoodItems() {
        return (List<FoodItem>) foodItemDaoJpa.findAll();
    }

    public FoodItem addFoodItem(FoodItem foodItem,Long id) {
        Restaurant foundRestaurant = restaurantDaoJpa.findById(id).get();
        foodItem.setRestaurant(foundRestaurant);
        foodItemDaoJpa.save(foodItem);
        return foodItem;
    }

    public void deleteFoodItem(Long id) {
        foodItemDaoJpa.deleteById(id);
    }

    public void updateFoodItem(Long id, FoodItem foodItem) {
        FoodItem foundFoodItem = foodItemDaoJpa.findById(id).get();

        if(foodItem.getFoodItem()!=null){
            foundFoodItem.setFoodItem(foodItem.getFoodItem());
        }if(foodItem.getPrice()!=null){
            foundFoodItem.setPrice(foodItem.getPrice());
        }if(foodItem.getType()!=null){
            foundFoodItem.setType(foodItem.getType());
        }
        foodItemDaoJpa.save(foundFoodItem);
    }
}
