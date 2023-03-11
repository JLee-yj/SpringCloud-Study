package org.example.dao;

import org.example.entities.Payment;

public interface PaymentDAO {

    int create(Payment payment);

    Payment getPaymentById(Long id);

}
