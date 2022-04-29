package com.foodbear.foodbear.entities;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "foodbearuser")
public class FoodBearUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private AuthorizationType authorizationType;

    @OneToOne (fetch = FetchType.EAGER)
    private UserAddress userAddress;

    @OneToMany
    private Set<FoodBearOrder> orders = new HashSet<>();

}
