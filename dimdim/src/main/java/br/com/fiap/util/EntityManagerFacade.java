package br.com.fiap.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFacade {
	
	public EntityManager getEntityManager() {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("dimdim-persistence-unit");
		return factory.createEntityManager();
	}
}
