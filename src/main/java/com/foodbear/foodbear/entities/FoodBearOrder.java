package com.foodbear.foodbear.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "foodbearorder")
public class FoodBearOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime localDateTime;

//    @ManyToOne
//    private FoodBearUser customer;
//
//    @OneToMany
//    private Set<FoodItem> foodItems=new HashSet<>();

   @PrePersist
    public void getCurrentDate(){
       setLocalDateTime(LocalDateTime.now());
   }
}
