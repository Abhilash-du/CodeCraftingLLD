package com.example.bitcoin;


import lombok.AllArgsConstructor;

//Step2: Extend publisher class
@AllArgsConstructor
public class BitcoinManager extends Publisher{

    private Bitcoin bitcoin;

    public void setPrice(Double price){

        if (bitcoin.getPrice()-price>5.0){
            publish(price);
        }
        bitcoin.setPrice(price);
    }


}
