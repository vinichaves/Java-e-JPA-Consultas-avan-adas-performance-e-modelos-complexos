package br.com.alura.loja.dao;

import javax.persistence.EntityManager;

import br.com.alura.loja.modelo.Categoria;

/**
 * 
 * Abstração do acesso a fonte de dados na aplicação (Voltado para os dados da CATEGORIA
 * @author vinicius.chaves
 *
 */
public class CategoriaDao {
	
	private EntityManager em;

	public CategoriaDao(EntityManager em) {
		this.em = em;
	}
	
	/** * Metodo para cadastrar uma categoria * @param Cadastrarcategoria */
	public void cadastrar(Categoria categoria) {
		this.em.persist(categoria);
	}
	
	/** * Metodo para atualizar uma categoria * @param Atualizarcategoria */
	public void atualizar(Categoria categoria) {
		this.em.merge(categoria);
	}
	
	/** * Metodo para remover uma categoria * @param Removercategoria */
	public void remover(Categoria categoria) {
		categoria = em.merge(categoria);
		this.em.remove(categoria);
	}

}
