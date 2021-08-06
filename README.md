# Java-e-JPA-Consultas-avan-adas-performance-e-modelos-complexos
Curso Alura - Link do curso = https://cursos.alura.com.br/course/java-jpa-consultas-avancadas-performance-modelos-complexos

**
JPQL "SQL Orientado", para realizar consultas

#Pontos e comentarios importantes da aplicação

Mapeamentos utilizados
@ManytoMany
@OneToMany
@ManyToOne

Mappedby na anotação @OneToMany?
 Para indicar que se trata de um relacionamento bidirecional
 
Utilidade do parametro CASCADE:
  Propagar as operações relaizadas em uma entidade e em seu relacionamento

Como fazer relatorios:
  Utilizar o select NEW

Fazer buscas:
  Ulitizar o entityManager.FIND

Qual a vantagem de utilizar Named Queries?
  Deixa as consultas de uma entidade mais proxima da classe dela

