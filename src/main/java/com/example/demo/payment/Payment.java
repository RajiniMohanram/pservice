package com.example.demo.payment;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
	@Id
	private String checkNumber;
	private int customerNumber;
	private LocalDate paymentDate;
	private double balance;

	public Payment() {
		super();
// TODO Auto-generated constructor stub
	}

	public Payment(String checkNumber, int customerNumber, LocalDate paymentDate, double balance) {
		super();
		this.checkNumber = checkNumber;
		this.customerNumber = customerNumber;
		this.paymentDate = paymentDate;
		this.balance = balance;
	}

	public String getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Payment [checkNumber=" + checkNumber + ", customerNumber=" + customerNumber + ", paymentDate="
				+ paymentDate + ", balance=" + balance + "]";
	}
}