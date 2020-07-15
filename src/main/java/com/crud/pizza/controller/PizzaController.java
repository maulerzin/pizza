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

import com.crud.pizza.model.Pizza;
import com.crud.pizza.service.PizzaService;

@RestController
@RequestMapping(value="/pizza")
public class PizzaController {
	
	@Autowired
	PizzaService pizzaService;
	
	 @PostMapping(value = "/create") 
	 
	 public Pizza add(@RequestBody Pizza pizza) {
		 
		 return pizzaService.add(pizza);
	 
	  }
	 
	 @GetMapping(value = "/all")
	 public List<Pizza> getAll(){
		 return pizzaService.getAll();
	 }
	 
	 @DeleteMapping(value = "/delete/{id}")
	 public void deleteById(@RequestParam Long id) {
		 pizzaService.deleteById(id);
	 }
	
	

}
