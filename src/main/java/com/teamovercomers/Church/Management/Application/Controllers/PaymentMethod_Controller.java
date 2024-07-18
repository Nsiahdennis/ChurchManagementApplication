package com.teamovercomers.Church.Management.Application.Controllers;

import com.teamovercomers.Church.Management.Application.entity.Church;
import com.teamovercomers.Church.Management.Application.entity.PaymentMethod;
import com.teamovercomers.Church.Management.Application.service.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paymentMethod")
public class PaymentMethod_Controller {
    @Autowired

    private PaymentMethodService paymentMethodService;

    @GetMapping
    public List<PaymentMethod> getAllChurches() {
        return paymentMethodService.getAllPaymentMethod();
    }

    @GetMapping("/{id}")
    public PaymentMethod getPaymentMethodById(@PathVariable Long id) {

        return paymentMethodService.getPaymentMethodById(id);
    }

    @PostMapping
    public PaymentMethod createPaymentMethod(@RequestBody PaymentMethod paymentMethod) {

        return paymentMethodService.createPaymentMethod(paymentMethod);
    }

    @PutMapping("/{id}")
    public PaymentMethod updatePaymentMethod(@PathVariable Long id, @RequestBody PaymentMethod paymentMethod) {
        return paymentMethodService.updatePaymentMethod(id, paymentMethod);
    }

    @PatchMapping("/{id}")
    public PaymentMethod updatesPaymentMethod(@PathVariable Long id, @RequestBody PaymentMethod paymentMethod) {
        PaymentMethod PaymentMethod = null;
        return paymentMethodService.updatePaymentMethod(id, null);
    }

    @DeleteMapping("/{id}")
    public PaymentMethod DeletePaymentMethod(@PathVariable Integer id) {
        paymentMethodService.deletePaymentMethod(id);
        return null;

    }
}
