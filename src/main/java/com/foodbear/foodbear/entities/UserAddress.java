package com.foodbear.foodbear.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "useraddress")
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
