/**
 * 
 */
package br.com.paulohonfi.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.paulohonfi.hrworker.entities.Worker;

/**
 * @author Paulo Honfi
 * @Link www.paulohonfi.com.br
 *
 * @Since 06-2021
 */
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
