package com.teamovercomers.Church.Management.Application.repository;


import com.teamovercomers.Church.Management.Application.entity.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod , Long>{
}