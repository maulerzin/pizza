package com.crud.pizza.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.crud.pizza.model.Pizza;
import com.crud.pizza.repository.PizzaRepo;

@Service
public class PizzaService {
	
	@Autowired
	PizzaRepo pizzaRepo;
	
	public  Pizza add(Pizza pizza) {
		
		return  pizzaRepo.save(pizza);
	}
	
	public List<Pizza> getAll(){
		
		List<Pizza> list = pizzaRepo.findAll();
		if(list.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT);
		}
		
		return list;
	}
	
	public void  deleteById(Long id) {
		Optional<Pizza> pizza = pizzaRepo.findById(id);
		
		if (pizza.isPresent()) {
			pizzaRepo.deleteById(id);
		}else
			throw new ResponseStatusException(HttpStatus.NO_CONTENT);
	}
}
