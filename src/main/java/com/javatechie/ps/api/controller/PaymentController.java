package com.javatechie.ps.api.controller;

import com.javatechie.ps.api.entity.Payment;
import com.javatechie.ps.api.service.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private PaymentService paymentService;

    @PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment){
        return paymentService.doPayment(payment);
    }
}
