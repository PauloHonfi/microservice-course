/**
 * 
 */
package br.com.paulohonfi.hrpayroll.hruser.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.paulohonfi.hrpayroll.hruser.entities.User;
import br.com.paulohonfi.hrpayroll.hruser.repositories.UserRepository;

/**
 * @author Paulo Honfi
 * @Link www.paulohonfi.com.br
 *
 * @Since 06-2021
 */
@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	public User findById(final Long id) {
		return repository.findById(id).get();
	}
	
	public User findByEmail(final String email) {
		return repository.findByEmail(email);
	}
}
