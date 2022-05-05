/*
package com.foodbear.foodbear.reciever;

import com.foodbear.foodbear.sender.Sender;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;


@Component
public class OrderReciever {

    private static JmsTemplate jmsTemplate;
    public static final String FOODBEAR_QUEUE = "foodbear-queue";

    @JmsListener(destination = Sender.FOODBEAR_QUEUE)
    public static String orderListener(){
         return (String) jmsTemplate.receiveAndConvert(FOODBEAR_QUEUE);
    }
}
*/
