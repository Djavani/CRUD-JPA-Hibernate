package com.algaworks.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.curso.modelo.Cliente;

public class AtualizandoPrimeiroObjeto {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");		
		EntityManager em = emf.createEntityManager();
		
		//colocar o objeto para ser gerenciado pelo EM
		Cliente cliente = em.find(Cliente.class, 1L);
		
		em.getTransaction().begin();
		
		cliente.setNome("José da Silva Pereira");
		cliente.setIdade(28);
		
		//objeto já está gerenciado pelo EM, basta o commit neste caso
		em.getTransaction().commit();
		
		System.out.println("Cliente alterado com sucesso !");

	}

}
