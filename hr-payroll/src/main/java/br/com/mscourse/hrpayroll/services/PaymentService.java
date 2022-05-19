package br.com.mscourse.hrpayroll.services;

import org.springframework.stereotype.Service;

import br.com.mscourse.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment ("Bob", 150.0, days);
	}
}