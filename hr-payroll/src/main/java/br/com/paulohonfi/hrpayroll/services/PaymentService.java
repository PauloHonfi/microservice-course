/**
 * 
 */
package br.com.paulohonfi.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.paulohonfi.hrpayroll.entities.Payment;
import br.com.paulohonfi.hrpayroll.entities.Worker;

/**
 * @author Paulo Honfi
 * @Link www.paulohonfi.com.br
 *
 * @Since 06-2021
 */
@Service
public class PaymentService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${hr-worker.host}")
	private String workerHost;
	
	public Payment getPayment(final Long workerId, final int days) {
		Map<String, String> uriVariables = new HashMap<String, String>();
		uriVariables.put("id", String.valueOf(workerId));
		
		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
