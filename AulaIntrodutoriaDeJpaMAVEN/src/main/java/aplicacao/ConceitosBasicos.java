package aplicacao;

public class ConceitosBasicos {
}
/*
 * Os Conceitos de JPA e Hibernate s�o aplicados somente no Progeto: AulaIntrodut�riaDeJPA_e_MAVEN.
	Nesse projeto tem apenas os conceitos e duas classes simples: Program e Person.
	
* ORM = MAPEAMENTO OBJETO-RELACIONAL (VIS�O GERAL):
 
	- Problema B�sico por tr�z de objeto-ralacional e JPA/Hibernate:
		- Por v�rios anos, a maior dificuldade de se usar a abordagem orientada a objetos �:
			- A COMUNICA��O com o banco de dados relacional PORQUE:
				- O banco de dados n�o � orientado a objetos, seu paradgma � o RELACIONAL
		
		- Ent�o quando se fazia um sistema com classes orientadas a objetos e etc... a comunica��o para intera��o desses objetos no banco de dados
		- Era muito trabalhoso por se tratar de dois PARADIGMAS diferentes:
			- Orientado a Objetos(Ex.: Objeto em JAVA no sistema desenvolvido)
			- Relacional(Ex.: Dados em SQL no banco de dados))

		- PROBLEMAS:
			- Toda hora tinha que ficar transportando de tabela para objetos e vice-versa
			- Contexto de persist�ncia
				- Objetos que est�o ou n�o atrelados a uma conex�o em um dado momento
			
			- Mapa de identidade
				- Fazer Cache de objetos j� carregados
				- Porque uma vez que o objeto j� foi buscado do banco de dados ele j� esta instanciado na mem�ria e n�o precisa busca-lo novamente no banco de dados se precisar do objeto novamente
			
			- Carregamento tardio
				- lazy loading
					- EXEMPLO: Buscar uma categoria de produtos no banco. Ent�o n�o quero os produtos apenas a categoria e isso era programado manualmente
			
			- As ferramentas de objeto-relacional faz todas essas coisas automaticamente
	
	- Ent�o resumindo o MAPEAMENTO OBJETO-RELACIONAL surgiu para MELHORAR a comunica��o entre um sistema Orientado a Objetos e o banco de dados relacional

* JPA e Hibernate:
	- O que � JPA (Java Persistence API)? 
		- � a especifica��o padr�o da plataforma Java EE(Enterprise)
		- Pacote JAVAX.PERSISTENCE
		- � utilizada para mapeamento objeto-relacional e persist�ncia de dados.
			- Mapeamento OBJETO-RELACIONAL (ORM)
			
			- Persistencia de dados
				- � fazer com que dados sejam armazenados por mais tempo.
				- O armazenamento desses dados pode acontecer de diferentes maneiras
		- JPA � apenas uma especifica��o (JSR 338)
		- Para trabalhar com JPA � preciso incluir no projeto uma IMPLEMENTA��O da API 
			- A implementa��o mais utilizada � a: Hibernate

* Diferen�a entre JPA e Hibernate:
	- Muitos confundem a diferen�a entre o Hibernate e o JPA. O Hibernate � de fato o framework ORM, ou seja, a implementa��o f�sica do que voc� usar� para
	persistir, remover, atualizar ou buscar dados no SGBD. Por outro lado, o JPA � uma camada que descreve uma interface comum para frameworks ORM.

	- Voc� pode desenvolver todo seu sistema sem JPA, apenas com Hibernate ou qualquer outro framework ORM, como o TopLink . Por�m voc� n�o pode desenvolver
	o sistema apenas com JPA, pois ele � apenas uma interface a ser utilizada por Frameworks ORM.

	- A ideia geral � tornar o sistema o mais abstrato poss�vel e pass�vel de mudan�as sem grandes impactos. Se voc� desenvolver todo seu sistema usando JPA
	com o framework Hibernate e amanh� decide mudar para o TopLink , ent�o as altera��es ser�o m�nimas.

* Principais classes do JPA:
	- EntityManager:
		- Um objeto EntityManager encapsula uma CONEX�O com a base de dados e serve para efetuar OPERA��ES DE ACESSO A DADOS (inser��o, remo��o, dele��o, atualiza��o)
		em ENTIDADES (clientes, produtos, pedidos, etc.) por ela MONITORADAS em um mesmo CONTEXTO DE PERSIST�NCIA.
		
		- A grosso modo INSTANCIAR um EntityManager � conectar ao banco de dados.
			- E apartir do objeto EntityManager que efetuaremos as OPERA��ES DE ACESSO A DADOS nas ENTIDADES
		
		- ESCOPO: Tipicamente mantem-se uma inst�ncia �nica de EntityManager para cada thread(requisi��o em sistema WEB) do sistema (no caso de aplica��es web, para
		cada requisi��o ao sistema).
		
	- EntityManagerFactory:
		- Um objeto EntityManagerFactory � utilizado para instanciar objetos EntityManager.
		
		- ESCOPO: Tipicamente mantem-se uma inst�ncia �nica de EntityManagerFactory para toda aplica��o.
		
*/