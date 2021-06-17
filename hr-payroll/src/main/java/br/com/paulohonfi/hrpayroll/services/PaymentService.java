/**
 * 
 */
package br.com.paulohonfi.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.paulohonfi.hrpayroll.entities.Payment;
import br.com.paulohonfi.hrpayroll.entities.Worker;
import br.com.paulohonfi.hrpayroll.feignclients.WorkerFeignClient;

/**
 * @author Paulo Honfi
 * @Link www.paulohonfi.com.br
 *
 * @Since 06-2021
 */
@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(final Long workerId, final int days) {
		
		final Worker worker = workerFeignClient.findById(workerId).getBody();
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
