package com.javatechie.ps.api.service;

import com.javatechie.ps.api.entity.Payment;
import com.javatechie.ps.api.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {


    @Autowired
    private PaymentRepository paymentRepository;


    public Payment doPayment(Payment payment){
        payment.setPaymentStatus(paymentProcessing());
        payment.setTransactionId(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }


    public String paymentProcessing(){
        // api should be third party gateway like paypal , ponepe
        return new Random().nextBoolean()?"success":"false";
    }
}
