package com.teamovercomers.Church.Management.Application.service;

import com.teamovercomers.Church.Management.Application.entity.PaymentMethod;
import com.teamovercomers.Church.Management.Application.repository.PaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.teamovercomers.Church.Management.Application.repository.PaymentMethodRepository.*;

@Service
public class PaymentMethodService {

@Autowired
    private PaymentMethodRepository paymentMethodRepository;
    public List<PaymentMethod> getAllPaymentMethod() {

        return paymentMethodRepository.findAll();
    }

    public PaymentMethod getPaymentMethodById(Long id) {
        return PaymentMethodRepository.findById(id).orElse(null);
    }
    public PaymentMethod savePaymentMethod(PaymentMethod paymentMethod) {
        return paymentMethodRepository.save(paymentMethod);
    }
    public void deletePaymentMethod(Integer id) {
        paymentMethodRepository.deleteById(id);
    }

}
