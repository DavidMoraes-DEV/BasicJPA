package aplicacao;

public class ConceitosBasicos {
}
/*
 * Os Conceitos de JPA e Hibernate são aplicados somente no Progeto: AulaIntrodutóriaDeJPA_e_MAVEN.
	Nesse projeto tem apenas os conceitos e duas classes simples: Program e Person.
	
* ORM = MAPEAMENTO OBJETO-RELACIONAL (VISÃO GERAL):
 
	- Problema Básico por tráz de objeto-ralacional e JPA/Hibernate:
		- Por vários anos, a maior dificuldade de se usar a abordagem orientada a objetos é:
			- A COMUNICAÇÃO com o banco de dados relacional PORQUE:
				- O banco de dados não é orientado a objetos, seu paradgma é o RELACIONAL
		
		- Então quando se fazia um sistema com classes orientadas a objetos e etc... a comunicação para interação desses objetos no banco de dados
		- Era muito trabalhoso por se tratar de dois PARADIGMAS diferentes:
			- Orientado a Objetos(Ex.: Objeto em JAVA no sistema desenvolvido)
			- Relacional(Ex.: Dados em SQL no banco de dados))

		- PROBLEMAS:
			- Toda hora tinha que ficar transportando de tabela para objetos e vice-versa
			- Contexto de persistência
				- Objetos que estão ou não atrelados a uma conexão em um dado momento
			
			- Mapa de identidade
				- Fazer Cache de objetos já carregados
				- Porque uma vez que o objeto já foi buscado do banco de dados ele já esta instanciado na memória e não precisa busca-lo novamente no banco de dados se precisar do objeto novamente
			
			- Carregamento tardio
				- lazy loading
					- EXEMPLO: Buscar uma categoria de produtos no banco. Então não quero os produtos apenas a categoria e isso era programado manualmente
			
			- As ferramentas de objeto-relacional faz todas essas coisas automaticamente
	
	- Então resumindo o MAPEAMENTO OBJETO-RELACIONAL surgiu para MELHORAR a comunicação entre um sistema Orientado a Objetos e o banco de dados relacional

* JPA e Hibernate:
	- O que é JPA (Java Persistence API)? 
		- É a especificação padrão da plataforma Java EE(Enterprise)
		- Pacote JAVAX.PERSISTENCE
		- É utilizada para mapeamento objeto-relacional e persistência de dados.
			- Mapeamento OBJETO-RELACIONAL (ORM)
			
			- Persistencia de dados
				- É fazer com que dados sejam armazenados por mais tempo.
				- O armazenamento desses dados pode acontecer de diferentes maneiras
		- JPA é apenas uma especificação (JSR 338)
		- Para trabalhar com JPA é preciso incluir no projeto uma IMPLEMENTAÇÃO da API 
			- A implementação mais utilizada é a: Hibernate

* Diferença entre JPA e Hibernate:
	- Muitos confundem a diferença entre o Hibernate e o JPA. O Hibernate é de fato o framework ORM, ou seja, a implementação física do que você usará para
	persistir, remover, atualizar ou buscar dados no SGBD. Por outro lado, o JPA é uma camada que descreve uma interface comum para frameworks ORM.

	- Você pode desenvolver todo seu sistema sem JPA, apenas com Hibernate ou qualquer outro framework ORM, como o TopLink . Porém você não pode desenvolver
	o sistema apenas com JPA, pois ele é apenas uma interface a ser utilizada por Frameworks ORM.

	- A ideia geral é tornar o sistema o mais abstrato possível e passível de mudanças sem grandes impactos. Se você desenvolver todo seu sistema usando JPA
	com o framework Hibernate e amanhã decide mudar para o TopLink , então as alterações serão mínimas.

* Principais classes do JPA:
	- EntityManager:
		- Um objeto EntityManager encapsula uma CONEXÃO com a base de dados e serve para efetuar OPERAÇÕES DE ACESSO A DADOS (inserção, remoção, deleção, atualização)
		em ENTIDADES (clientes, produtos, pedidos, etc.) por ela MONITORADAS em um mesmo CONTEXTO DE PERSISTÊNCIA.
		
		- A grosso modo INSTANCIAR um EntityManager é conectar ao banco de dados.
			- E apartir do objeto EntityManager que efetuaremos as OPERAÇÕES DE ACESSO A DADOS nas ENTIDADES
		
		- ESCOPO: Tipicamente mantem-se uma instância única de EntityManager para cada thread(requisição em sistema WEB) do sistema (no caso de aplicações web, para
		cada requisição ao sistema).
		
	- EntityManagerFactory:
		- Um objeto EntityManagerFactory é utilizado para instanciar objetos EntityManager.
		
		- ESCOPO: Tipicamente mantem-se uma instância única de EntityManagerFactory para toda aplicação.
	
* Como o JPA trabalha?
		- Por padrão cria:
			- Uma tabela com o mesmo nome da CLASSE
			- E a colunas das tabelas terão os mesmos nomes dos atributos dessa classe
			
		- Se quiser que seja outros nomes tem que colocar um annotation e definir o nome
			- Exemplo:
				- @Column(name=nomeCompleto")
				- private String nome;
				- Nesse exemplo será alterado o nome da coluna que receberia o nome do atributo "nome" e ao criar o mapeamento ficará "nomeCompleto"

* ENTIDADE MONITORADA: 
	- Para conseguir remover um objeto do tipo Pessoa do banco de dados utilizando o EntityManager:
	- É preciso que seja uma ENTIDADE MONITORADA:
		- Para não dar o erro Removing a DETACHED instance dominio.Pessoa#1
			- O objeto solicitado no caso abaixo será o com o ID = 1 TEM que estar MONITORADO
			
	- O que é um OBJETO MONITORADO?
		- É um objeto que acabou de ser inserido ou um objeto que foi buscado no banco de dados e ainda não fechou o EntityManager
		
* MAVEN
	- É o gerenciador de DEPENDENCIAS e build do JAVA
*/