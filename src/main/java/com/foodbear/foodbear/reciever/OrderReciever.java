package com.foodbear.foodbear.reciever;

import com.foodbear.foodbear.entities.FoodOrder;
import com.foodbear.foodbear.jmsconfig.JmsConfig;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Component
public class OrderReciever {

    @JmsListener(destination = JmsConfig.FOODBEAR_QUEUE)
    public void  orderListener(@Payload FoodOrder foodOrder){
        System.out.println("I got a order");
        System.out.println(foodOrder);
    }
}
