package com.yadavkhanal.payments.service;

import com.yadavkhanal.common.dto.Payment;

import java.util.List;

public interface PaymentService {
    List<Payment> findAll();

    Payment process(Payment payment);
}
