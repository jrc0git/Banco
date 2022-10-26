package edu.es.eoi.Service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;


import edu.es.eoi.entity.Cuenta;



public class CuentaDaoJPAImpl implements CuentaDao {
	
	private EntityManager manager = Persistence.createEntityManagerFactory("MIBASEDEDATOS").createEntityManager();

	@Override
	public void create(Cuenta cuenta) {
		manager.getTransaction().begin();
		manager.persist(cuenta);
		manager.getTransaction().commit();
		
	}

	@Override
	public Cuenta read(int id) {
		return manager.find(Cuenta.class, id);
	}

	@Override
	public void update(Cuenta cuenta) {
		manager.getTransaction().begin();
		manager.merge(cuenta);
		manager.getTransaction().commit();
		
	}

	@Override
	public void delete(int id) {
		manager.getTransaction().begin();
		manager.remove(read(id));
		manager.getTransaction().commit();
		
	}

	@Override
	public List<Cuenta> findAll() {
		Query query = manager.createQuery("FROM Cuenta");
		return query.getResultList();
	}
	
	
}
