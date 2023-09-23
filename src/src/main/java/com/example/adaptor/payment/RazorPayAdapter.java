package com.example.adaptor.payment;

import com.example.adaptor.payment.external.RazorPayAPI;
import com.example.adaptor.payment.external.RazorPayStatus;

public class RazorPayAdapter implements PaymentProvider{
    @Override
    public String generateLink() {
        return null;
    }

    private final RazorPayAPI razorPayAPI=new RazorPayAPI();
    @Override
    public void createPayment(Long id, String name, String email, Double amount) {
        razorPayAPI.pay(id, name, email, amount);

    }

    @Override
    public PaymentStatus checkStatus() {
        RazorPayStatus status = razorPayAPI.checkStatus();
        return toPaymentStatus(status);
    }

    private PaymentStatus toPaymentStatus(RazorPayStatus status) {

        if (status == RazorPayStatus.OK) {
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.FAILURE;
    }
}
