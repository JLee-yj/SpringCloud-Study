package org.example.service.impl;

import org.example.dao.PaymentDAO;
import org.example.entities.Payment;
import org.example.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * payment Service
 *
 * @author Lyj
 * @date 2023-03-11
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDAO paymentDAO;

    @Override
    public int create(Payment payment) {
        return paymentDAO.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDAO.getPaymentById(id);
    }
}
