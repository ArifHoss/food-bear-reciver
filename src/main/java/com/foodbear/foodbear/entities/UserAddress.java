package com.foodbear.foodbear.entities;

import javax.persistence.*;

@Entity
public class UserAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String adressLine;
    private Long zipcode;
    private String City;

    @OneToOne
    private FoodBearUser foodBearUser;


}
