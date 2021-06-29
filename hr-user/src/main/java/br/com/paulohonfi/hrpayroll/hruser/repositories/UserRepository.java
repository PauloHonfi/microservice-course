/**
 * 
 */
package br.com.paulohonfi.hrpayroll.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.paulohonfi.hrpayroll.hruser.entities.User;

/**
 * @author Paulo Honfi
 * @Link www.paulohonfi.com.br
 *
 * @Since 06-2021
 */
public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(final String email);

}
