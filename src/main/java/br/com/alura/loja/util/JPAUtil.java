package br.com.alura.loja.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Esse método cria um objeto do tipo EntityManager que permite que faça queries no seu banco de dados, só que baseado nas suas classes.
 * @author vinicius.chaves
 *
 */
public class JPAUtil {
	
	private static final EntityManagerFactory FACTORY = Persistence
			.createEntityManagerFactory("loja");

	public static EntityManager getEntityManager() { 
		return FACTORY.createEntityManager();
	}
	
}
