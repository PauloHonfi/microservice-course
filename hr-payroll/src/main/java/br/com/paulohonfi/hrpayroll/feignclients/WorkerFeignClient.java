/**
 * 
 */
package br.com.paulohonfi.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.paulohonfi.hrpayroll.entities.Worker;


/**
 * @author Paulo Honfi
 * @Link www.paulohonfi.com.br
 *
 * @Since 06-2021
 */
@Component
@FeignClient(name = "hr-worker", url = "localhost:8001", path = "/workers")
public interface WorkerFeignClient {
	
	@GetMapping("/{id}")
	ResponseEntity<Worker> findById(@PathVariable Long id);

}
