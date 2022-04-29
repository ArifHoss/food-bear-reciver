package com.foodbear.foodbear.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long discount;
    private String promotionName;

    @OneToMany
    private Set<FoodBearOrder> orders = new HashSet<>();
}
