package com.example.bitcoin;

import java.util.ArrayList;
import java.util.List;

// Step1: create an interface fo publisher + registry
public abstract class Publisher {

    private List<Consumer> consumers=new ArrayList<>();

    public void publish(Double price){
//        for(Consumer consumer:consumers){
//            consumer.consume();;
//        }
        consumers.forEach(consumer -> consumer.consume(price));

    }

    public void addConsumer(Consumer consumer){
        consumers.add(consumer);

    }

    public void removeConsumer(Consumer consumer){
        consumers.remove(consumer);
    }

}