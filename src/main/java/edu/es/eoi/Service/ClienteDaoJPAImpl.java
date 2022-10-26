package edu.es.eoi.Service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.es.eoi.entity.Cliente;

public class ClienteDaoJPAImpl implements ClienteDao {

	private EntityManager manager = Persistence.createEntityManagerFactory("MIBASEDEDATOS").createEntityManager();

	@Override
	public void create(Cliente cliente) {
		manager.getTransaction().begin();
		manager.persist(cliente);
		manager.getTransaction().commit();

	}

	@Override
	public void update(Cliente cliente) {
		manager.getTransaction().begin();
		manager.merge(cliente);
		manager.getTransaction().commit();

	}

	@Override
	public Cliente read(String dni) {
		return manager.find(Cliente.class, dni);
	}

	@Override
	public void delete(String dni) {
		manager.getTransaction().begin();
		manager.remove(read(dni));
		manager.getTransaction().commit();

	}

	@Override
	public List<Cliente> findAll() {
		Query query = manager.createQuery("FROM Cliente");
		return query.getResultList();
	}

}
