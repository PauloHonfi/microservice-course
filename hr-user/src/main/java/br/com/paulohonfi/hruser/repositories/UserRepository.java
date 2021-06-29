/**
 * 
 */
package br.com.paulohonfi.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.paulohonfi.hruser.entities.User;

/**
 * @author Paulo Honfi
 * @Link www.paulohonfi.com.br
 *
 * @Since 06-2021
 */
public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(final String email);

}
