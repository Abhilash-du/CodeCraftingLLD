package com.example.adaptor.payment;

import com.example.adaptor.payment.external.PayUAPI;
import com.example.adaptor.payment.external.PayUStatus;
import com.example.adaptor.payment.external.RazorPayStatus;

public class PayUAdapter implements PaymentProvider{
    @Override
    public String generateLink() {
        return null;
    }

    private PayUAPI payUAPI=new PayUAPI();
    @Override
    public void createPayment(Long id, String name, String email, Double amount) {
        payUAPI.pay(id, amount);
    }

    @Override
    public PaymentStatus checkStatus() {
        PayUStatus paymentStatus=payUAPI.checkStatus();

        return toPaymentStatus(paymentStatus);
    }

    private PaymentStatus toPaymentStatus(PayUStatus status) {

        if (status == PayUStatus.OK) {
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.FAILURE;
    }
}
