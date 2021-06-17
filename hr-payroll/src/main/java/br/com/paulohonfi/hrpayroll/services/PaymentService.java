/**
 * 
 */
package br.com.paulohonfi.hrpayroll.services;

import org.springframework.stereotype.Service;

import br.com.paulohonfi.hrpayroll.entities.Payment;

/**
 * @author Paulo Honfi
 * @Link www.paulohonfi.com.br
 *
 * @Since 06-2021
 */
@Service
public class PaymentService {
	
	public Payment getPayment(final Long workerId, final int days) {
		return new Payment("Bob", 200.0, days);
	}
}
