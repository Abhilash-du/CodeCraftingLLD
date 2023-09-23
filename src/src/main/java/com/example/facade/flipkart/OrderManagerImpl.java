package com.example.facade.flipkart;

public class OrderManagerImpl implements OrderManager{

    private final OrderProcessor orderProcessor=new OrderProcessorImpl();
    @Override
    public void checkout(Long orderId) {
        // Check for Inventory
        orderProcessor.process(orderId);
    }
}


