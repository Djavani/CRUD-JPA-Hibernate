package com.algaworks.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.curso.modelo.Cliente;

public class SalvandoPrimeiroObjeto {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");		
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Pedro Bial");
		cliente.setIdade(50);
		cliente.setProfissao("Jornalista");
		cliente.setSexo("M");
		
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		
		System.out.println("cliente salvo com sucesso");
		//em.close();

	}

}
