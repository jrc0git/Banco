package edu.es.eoi.Service;

import java.util.List;

import edu.es.eoi.entity.Cuenta;



public interface CuentaDao {
	
	void create(Cuenta cuenta);

	Cuenta read(int id);

	void update(Cuenta cuenta);

	void delete(int id);
	
	public List<Cuenta> findAll();

}
