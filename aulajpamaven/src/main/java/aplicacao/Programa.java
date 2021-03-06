package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		// Repository layer
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		// To add on table
		// em.getTransaction().begin();
		// em.persist(p1);
		// em.persist(p2);
		// em.persist(p3);
		// em.getTransaction().commit();
		
		
		// to search on table
		// Pessoa p = em.find(Pessoa.class, 2);
		// System.out.println(p);
		
		// to delete on table
		// Pessoa p = em.find(Pessoa.class, 2);
		// em.getTransaction().begin();
		// em.remove(p);
		// em.getTransaction().commit();
		
		// Just for debug
		System.out.println("Pronto !");
		
		// close the repository
		em.close();
		emf.close();
	}

}
