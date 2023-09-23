package com.example.adaptor.payment;

public interface PaymentProvider {

    public String generateLink();

    public void createPayment(Long id, String name, String email, Double amount);

    public PaymentStatus checkStatus();
}
