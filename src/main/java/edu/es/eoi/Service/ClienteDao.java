package edu.es.eoi.Service;

import java.util.List;

import edu.es.eoi.entity.Cliente;



public interface ClienteDao {
	
	void create(Cliente cliente);

	Cliente read(String dni);

	void update(Cliente cliente);

	void delete(String dni);
	
	public List<Cliente> findAll();

}
