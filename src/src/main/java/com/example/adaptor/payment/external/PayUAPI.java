package com.example.adaptor.payment.external;

public class PayUAPI {
    public void pay(Long id, Double amount){
        System.out.println("Razor pay payment");
    }
    public PayUStatus checkStatus(){
        return PayUStatus.OK;
    }
}

