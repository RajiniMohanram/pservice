package com.example.demo.payment;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends CrudRepository<Payment, String> {
}
