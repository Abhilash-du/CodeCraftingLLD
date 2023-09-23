package com.example.src.bhavioural;

import com.example.bitcoin.Bitcoin;
import com.example.bitcoin.BitcoinManager;
import com.example.bitcoin.EmailConsumer;
import com.example.bitcoin.SMSConsumer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BitcoinTest {

    private BitcoinManager bitcoinManager;
    // Setup => Create the dependencies
    @BeforeEach
    public void setup(){
        Bitcoin bitcoin =new Bitcoin(100.0);
        bitcoinManager=new BitcoinManager(bitcoin);
        bitcoinManager.addConsumer(new EmailConsumer());
        bitcoinManager.addConsumer(new SMSConsumer());

    }

    // TearDown ==> Destroy the dependencies

    @Test
    public void updatePrice(){
        System.out.println("Test");
        bitcoinManager.setPrice(90.0);
    }
}
