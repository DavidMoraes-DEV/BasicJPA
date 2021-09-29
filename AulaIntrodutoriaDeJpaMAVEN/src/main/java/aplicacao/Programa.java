package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		/*
		-> HABILITAR APENAS NA PRIMEIRA EXECUCAO PARA ADICIONAR OS OBJETOS NO BANCO DE DADOS
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		/* -> HABILITAR APENAS NA PRIMEIRA EXECUCAO PARA ADICIONAR OS OBJETOS NO BANCO DE DADOS
		em.getTransaction().begin();  -> INICIA UMA TRANSACAO COM O BANCO DE DADOS
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit(); -> CONFIRMA AS TRANSACOES FEITAS NO BANCO DE DADOS
		*/
		
		/*Busca um objeto pelo ID -> .find no banco de dados com JPA*/
		Pessoa p1 = em.find(Pessoa.class, 8);
		System.out.println(p1);
		
		/*Apaga um objeto do banco de dados -> .remove
		em.getTransaction().begin();
		Pessoa p2 = em.find(Pessoa.class, 8);
		em.remove(p2);
		em.getTransaction().commit();*/
		
		System.out.println("PRONTO!");
		em.close(); /*Fecha o EntityManager*/
		emf.close(); /*Fecha o EntityManagerFactory*/
	}
}
