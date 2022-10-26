package edu.es.eoi.Service;

import java.util.List;

import edu.es.eoi.entity.Banco;


public interface BancoDao {
	
	void create(Banco banco);

	Banco read(int id);

	void update(Banco banco);

	void delete(int id);
	
	public List<Banco> findAll();

}
