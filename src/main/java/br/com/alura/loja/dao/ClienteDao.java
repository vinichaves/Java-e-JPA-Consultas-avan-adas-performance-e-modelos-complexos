package br.com.alura.loja.dao;

import javax.persistence.EntityManager;

import br.com.alura.loja.modelo.Cliente;
import br.com.alura.loja.modelo.Produto;

/**
 * 
 * Abstra��o do acesso a fonte de dados na aplica��o (Voltado para os dados da CLIENTEDAO)
 * @author vinicius.chaves
 *
 */
public class ClienteDao {

	private EntityManager em;

	public ClienteDao(EntityManager em) {
		this.em = em;
	}
	
	/** * Metodo para cadastrar um cliente * @param CadastrarCliente */
	public void cadastrar(Cliente cliente) {
		this.em.persist(cliente);
	}
	
	/** * Metodo para buscarPorId um cliente * @param CadastrarBuscarPorId */
	public Cliente buscarPorId(Long id) {
		return em.find(Cliente.class, id);
	}


}
