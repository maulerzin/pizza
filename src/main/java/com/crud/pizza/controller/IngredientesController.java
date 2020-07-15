package com.crud.pizza.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crud.pizza.model.Ingredientes;
import com.crud.pizza.service.IngredientesService;

@RestController
@RequestMapping(value="/ingredientes")
public class IngredientesController {
	
	@Autowired
	IngredientesService ingredientesService;
	
	@PostMapping(value = "/create") 
	 
	 public Ingredientes add(@RequestBody Ingredientes ingredientes) {
		 
		 return ingredientesService.add(ingredientes);
	 
	  }
	 
	 @GetMapping(value = "/all")
	 public List<Ingredientes> getAll(){
		 return ingredientesService.getAll();
	 }
	 
	 @DeleteMapping(value = "/delete/{id}")
	 public void deleteById(@RequestParam Long id) {
		 ingredientesService.deleteById(id);
	 }

}
