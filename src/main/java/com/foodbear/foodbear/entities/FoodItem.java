package com.foodbear.foodbear.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "fooditem")
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String foodItem;
    private Long price;
    private String type;

    @ManyToOne (fetch = FetchType.EAGER)
    private Restaurant restaurant;
}
