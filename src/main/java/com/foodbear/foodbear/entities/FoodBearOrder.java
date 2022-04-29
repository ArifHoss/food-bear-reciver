package com.foodbear.foodbear.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

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
    private Long totalPrice;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime localDateTime;

    @ManyToOne(fetch= FetchType.EAGER)
    private FoodBearUser customer;

    @OneToMany
    private Set<FoodItem> orderItems=new HashSet<>();

    @ManyToOne
    private Promotion promotion;

   @PrePersist
    public void getCurrentDate(){
       setLocalDateTime(LocalDateTime.now());
   }
}
