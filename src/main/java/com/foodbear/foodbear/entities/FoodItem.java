package com.foodbear.foodbear.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
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

    @ManyToOne (cascade = CascadeType.MERGE)
    private Restaurant restaurant;


}
