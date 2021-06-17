/**
 * 
 */
package br.com.paulohonfi.hrworker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.paulohonfi.hrworker.entities.Worker;
import br.com.paulohonfi.hrworker.repositories.WorkerRepository;

/**
 * @author Paulo Honfi
 * @Link www.paulohonfi.com.br
 *
 * @Since 06-2021
 */
@Service
public class WorkerService {
	
	@Autowired
	private WorkerRepository repository;
	
	public List<Worker> findAll() {
		return repository.findAll();
	}
	
	public Worker findById(final Long id) {
		return repository.findById(id).get();
	}

}
