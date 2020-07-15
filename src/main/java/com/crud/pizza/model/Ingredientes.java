package com.crud.pizza.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Ingredientes {
	
	@Column (name="ingredientes_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	  @ManyToMany(mappedBy = "ingredientes") 
	  private List <Pizza> pizzas;
	 
	
	private String nome;

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
	
}
