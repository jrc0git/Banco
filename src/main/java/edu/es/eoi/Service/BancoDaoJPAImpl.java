package edu.es.eoi.Service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.es.eoi.entity.Banco;
import edu.es.eoi.entity.Cliente;

public class BancoDaoJPAImpl implements BancoDao {
	
	private EntityManager manager = Persistence.createEntityManagerFactory("MIBASEDEDATOS").createEntityManager();

	@Override
	public void create(Banco banco) {
		manager.getTransaction().begin();
		manager.persist(banco);
		manager.getTransaction().commit();
		
	}

	@Override
	public Banco read(int id) {
		return manager.find(Banco.class, id);
	}

	@Override
	public void update(Banco banco) {
		manager.getTransaction().begin();
		manager.merge(banco);
		manager.getTransaction().commit();
		
	}

	@Override
	public void delete(int id) {
		manager.getTransaction().begin();
		manager.remove(read(id));
		manager.getTransaction().commit();
		
	}

	@Override
	public List<Banco> findAll() {
		Query query = manager.createQuery("FROM Banco");
		return query.getResultList();
	}

}
