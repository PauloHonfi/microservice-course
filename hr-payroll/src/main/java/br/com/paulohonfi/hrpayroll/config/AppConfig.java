/**
 * 
 */
package br.com.paulohonfi.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Paulo Honfi
 * @Link www.paulohonfi.com.br
 *
 * @Since 06-2021
 */
@Configuration
public class AppConfig {

	@Bean
	public RestTemplate registerRestTemplate() {
		return new RestTemplate();
		
	}
}
