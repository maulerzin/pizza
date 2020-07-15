package com.crud.pizza.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MiddleTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPizza_id() {
		return pizza_id;
	}

	public void setPizza_id(Long pizza_id) {
		this.pizza_id = pizza_id;
	}

	public Long getIngredientes_id() {
		return ingredientes_id;
	}

	public void setIngredientes_id(Long ingredientes_id) {
		this.ingredientes_id = ingredientes_id;
	}

	public int getQtde() {
		return Qtde;
	}

	public void setQtde(int qtde) {
		Qtde = qtde;
	}

	private Long pizza_id;
	
	private Long ingredientes_id;
	
	private int Qtde;

}
