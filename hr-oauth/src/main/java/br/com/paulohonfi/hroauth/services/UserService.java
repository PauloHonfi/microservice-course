/**
 * 
 */
package br.com.paulohonfi.hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.paulohonfi.hroauth.entities.User;
import br.com.paulohonfi.hroauth.feignclients.UserFeignClient;

/**
 * @author Paulo Honfi
 * @Link www.paulohonfi.com.br
 *
 * @Since 06-2021
 */
@Service
public class UserService {
	
	private static Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserFeignClient userFeignClient;
	
	public User findByEmail(final String email) throws IllegalAccessException {
		User user = userFeignClient.findByEmail(email).getBody();
		if(user == null) {
			logger.error("Email not found " + email);
			throw new IllegalAccessException("Email not found");
		}
		
		logger.info("Email found " + email);
		return user;
	}
}
