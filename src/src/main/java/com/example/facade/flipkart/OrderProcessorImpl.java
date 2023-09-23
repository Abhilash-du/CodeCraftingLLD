package com.example.facade.flipkart;

public class OrderProcessorImpl implements OrderProcessor{
    private final InventoryService inventoryService=new InventoryService();
    private final PaymentService paymentService=new PaymentService();
    private final InvoiceService invoiceService=new InvoiceService();
    @Override
    public void process(Long orderID) {

    }
}
