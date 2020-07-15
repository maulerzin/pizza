package com.crud.pizza.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.crud.pizza.model.Ingredientes;
import com.crud.pizza.model.Pizza;
import com.crud.pizza.repository.IngredientesRepo;



@Service
public class IngredientesService {
	
	IngredientesRepo ingredientesRepo;

	public Ingredientes add(Ingredientes ingredientes) {

		return ingredientesRepo.save(ingredientes);
	}

	public List<Ingredientes> getAll() {

		List<Ingredientes> list = ingredientesRepo.findAll();
		if (list.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT);
		}

		return list;
	}
	
	public void  deleteById(Long id) {
		Optional<Ingredientes> ingredientes = ingredientesRepo.findById(id);
		
		if (ingredientes.isPresent()) {
			ingredientesRepo.deleteById(id);
		}else
			throw new ResponseStatusException(HttpStatus.NO_CONTENT);
	}

}
