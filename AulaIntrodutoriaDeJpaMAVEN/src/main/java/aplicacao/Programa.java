package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		//Instanciando um EntityManagerFactory com as configurações que estão no arquivo persistence.xml no pacote resource/META-INF
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
				
		//Instanciando um EntityManager com o EntityManagerFactory e apartir dessa instanciação se consegue uma conexão com o banco de dados e todo o conceito de persistencia implementada
		EntityManager em = emf.createEntityManager();		
		
		/*
		***EXECUTAR ESSE BLOCO DE COMANDOS APENAS NA PRIMEIRA VEZ PARA POVOAR O BANCO DE DADOS NO PHPMyAdmin utilizando o XAMPP com a porta do MySQL sendo 3307 porque a porta 3306 esta no MySQL Workbench
		
		//-> HABILITAR APENAS NA PRIMEIRA EXECUCAO PARA ADICIONAR OS OBJETOS NO BANCO DE DADOS
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		
		//-> HABILITAR APENAS NA PRIMEIRA EXECUCAO PARA ADICIONAR OS OBJETOS NO BANCO DE DADOS
		em.getTransaction().begin();  //-> INICIA UMA TRANSACAO COM O BANCO DE DADOS
		
		em.persist(p1); //.persist() pega um OBJETO e salva em um BANCO DE DADOS
		em.persist(p2);
		em.persist(p3);
		
		em.getTransaction().commit(); //-> CONFIRMA AS TRANSACOES FEITAS NO BANCO DE DADOS
		
		System.out.println("PRONTO!");
		*/
		
		//.find -> Busca um objeto pelo ID no banco de dados com JPA
		em.getTransaction().begin();;
		Pessoa p4 = em.find(Pessoa.class, 2);
		em.getTransaction().commit();
		System.out.println(p4);
		
		/*
		* ENTIDADE MONITORADA: 
			- Para conseguir remover um objeto do tipo Pessoa do banco de dados utilizando o EntityManager:
			- É preciso que seja uma ENTIDADE MONITORADA:
				- Para não dar o erro Removing a DETACHED instance dominio.Pessoa#1
					- O objeto solicitado no caso abaixo será o com o ID = 1 TEM que estar MONITORADO
			
			- O que é um OBJETO MONITORADO?
				- É um objeto que acabou de ser inserido ou um objeto que foi buscado no banco de dados e ainda não fechou o EntityManager
		*/
		
		//.remove -> Apaga um objeto do banco de dados
		em.getTransaction().begin();
		Pessoa p5 = em.find(Pessoa.class, 1);
		em.remove(p5);
		em.getTransaction().commit();
		
		System.out.println("PRONTO!");
		em.close(); /*Fecha o EntityManager*/
		emf.close(); /*Fecha o EntityManagerFactory*/
	}
}
