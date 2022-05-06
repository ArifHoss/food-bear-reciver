package com.foodbear.foodbear.tempuser;

import com.foodbear.foodbear.entities.AuthorizationType;
import com.foodbear.foodbear.entities.FoodBearUser;
import com.foodbear.foodbear.repo.FoodBearUserDaoJpa;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;

@Component
@RequiredArgsConstructor
public class StartUpRun implements CommandLineRunner {

    private final FoodBearUserDaoJpa foodBearUserDaoJpa;

    @Override
    public void run(String... args) throws Exception {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        if (!foodBearUserDaoJpa.existsByEmail("food@bear.se")){
            FoodBearUser user= FoodBearUser.builder()
                    .firstName("Mr. Food")
                    .lastName("Bear")
                    .email("food©bear.se")
                    .authorizationType(AuthorizationType.ADMIN)
                    .password(passwordEncoder.encode("hej123"))
//                    .encryptedPassword(passwordEncoder.encode("hej123").getBytes(StandardCharsets.UTF_8))
                    .build();

            foodBearUserDaoJpa.save(user);
        }
    }
}
