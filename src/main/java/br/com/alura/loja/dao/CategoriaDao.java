package br.com.alura.loja.dao;

import javax.persistence.EntityManager;

import br.com.alura.loja.modelo.Categoria;

/**
 * 
 * Abstra��o do acesso a fonte de dados na aplica��o (Voltado para os dados da CATEGORIA
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
