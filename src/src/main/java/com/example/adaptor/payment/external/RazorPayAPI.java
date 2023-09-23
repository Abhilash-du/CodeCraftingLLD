package com.example.adaptor.payment.external;

public class RazorPayAPI {

    public void pay(Long id, String name, String email, Double amount){
        System.out.println("Razor pay payment");
    }

    public RazorPayStatus checkStatus(){
        return RazorPayStatus.OK;
    }
}
