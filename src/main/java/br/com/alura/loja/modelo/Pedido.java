package br.com.alura.loja.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "valor_total")
	private BigDecimal valorTotal = BigDecimal.ZERO;
	private LocalDate data = LocalDate.now();

	// Relacionamento
	@ManyToOne (fetch = FetchType.LAZY)
	private Cliente cliente;
	
	/**
	 * No CascadeType, tudo que eu fiz na tabela pedido, faz tambem na itens pedido
	 */
	//Falando que o relacionamento ja existe na outra tabela
	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	private List<ItemPedido> itens = new ArrayList<>();

	public Pedido() {
	}

	public Pedido(Cliente cliente) {
		super();
		this.cliente = cliente;
	}
	
	public void adicionarItem(ItemPedido item) {
		item.setPedido(this);
		this.itens.add(item);
		this.valorTotal = this.valorTotal.add(item.getValor());
	}

	public Long getId() {
		return id;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public LocalDate getData() {
		return data;
	}

	public Cliente getCliente() {
		return cliente;
	}

}
