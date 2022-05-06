package com.foodbear.foodbear.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
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
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Transient
    private String password;
    private AuthorizationType authorizationType;
    @OneToOne (fetch = FetchType.EAGER)
    private UserAddress userAddress;

    @OneToMany
    private Set<FoodBearOrder> orders = new HashSet<>();

}
