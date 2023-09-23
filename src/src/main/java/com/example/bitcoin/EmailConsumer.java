package com.example.bitcoin;

public class EmailConsumer implements Consumer{
    @Override
    public void consume(Double price) {
        System.out.println("Sending Email for price:"+price);
    }
}
