package com.crud.pizza.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pizza {
	
	@Column (name="pizza_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	

	private String nome;
	
	
	 @ManyToOne 
	 //(mappedBy = "pizza" )
	private TipoMassa tipoMassa;
	 
	private BigDecimal valor;
	
	
	  @ManyToMany
	  	@JoinTable(name="MiddleTable", joinColumns =
	  		{@JoinColumn(name="pizza_id")}, inverseJoinColumns=
	  			{@JoinColumn(name="ingredientes_id")}) 
	  private List <Ingredientes> ingredientes;
	  
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}




	public TipoMassa getTipoMassa() {
		return tipoMassa;
	}

	public void setTipoMassa(TipoMassa tipoMassa) {
		this.tipoMassa = tipoMassa;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
}
