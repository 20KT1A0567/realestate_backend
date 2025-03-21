package com.example.realestate.repository;

import com.example.realestate.model.Payment;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
	Optional<Payment> findByRazorpayOrderId(String razorpayOrderId);
}	