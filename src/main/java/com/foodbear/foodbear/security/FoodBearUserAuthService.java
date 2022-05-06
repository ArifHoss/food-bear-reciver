package com.foodbear.foodbear.security;

import com.foodbear.foodbear.entities.FoodBearUser;
import com.foodbear.foodbear.repo.FoodBearUserDaoJpa;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class FoodBearUserAuthService implements UserDetailsService {

    private final FoodBearUserDaoJpa foodBearUserDaoJpa;

    public FoodBearUserAuthService(FoodBearUserDaoJpa foodBearUserDaoJpa) {
        this.foodBearUserDaoJpa = foodBearUserDaoJpa;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        FoodBearUser foodBearUser = foodBearUserDaoJpa.findByEmail(email);
        if (foodBearUser == null) {
            throw new UsernameNotFoundException("Can't find user with email: " + email);
        }
        return new FoodBearPrincipal(foodBearUser);
    }
}
