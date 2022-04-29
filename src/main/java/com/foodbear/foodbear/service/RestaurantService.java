package com.foodbear.foodbear.service;

import com.foodbear.foodbear.entities.Restaurant;
import com.foodbear.foodbear.repo.RestaurantDaoJpa;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@Service("restaurantService")
public class RestaurantService {

    private RestaurantDaoJpa restaurantDaoJpa;

    public List<Restaurant> getAllRestaurant() {
        return (List<Restaurant>) restaurantDaoJpa.findAll();
    }

    public Restaurant getRestaurantById(Long id) {
        return restaurantDaoJpa.findById(id).get();
    }

    public Restaurant create(Restaurant restaurant){
        return restaurantDaoJpa.save(restaurant);
    }

    public Restaurant update(Long id, Restaurant restaurant){
        Restaurant getRestaurant = restaurantDaoJpa.findById(id).get();
        if (restaurant.getName()!=null) {
            getRestaurant.setName(restaurant.getName());
        }

        return restaurantDaoJpa.save(restaurant);

    }

    public String delete(Long id){
        restaurantDaoJpa.deleteById(id);
        return "RESTAURANT_DELETED";
    }
}
