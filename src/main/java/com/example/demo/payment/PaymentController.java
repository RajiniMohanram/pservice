package com.example.demo.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PaymentController {
	@Autowired
	private PaymentRepo rep;

	@RequestMapping("/allPayments")
	public Iterable<Payment> getAllPayment() {
		return rep.findAll();

	}

	@RequestMapping("/find-payment/{checkNumber}")
	public Payment viewPayment(@PathVariable("checkNumber") String checkNumber, Model model) {
		Payment o = rep.findById(checkNumber).get();
		return o;
	}
	@PostMapping("/add-payments")
	public String addContact(@RequestBody Payment c) {
		rep.save(c);
		return "Success";
	}
}
