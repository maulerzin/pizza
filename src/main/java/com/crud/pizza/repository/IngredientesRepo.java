package com.crud.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.pizza.model.Ingredientes;

@Repository
public interface IngredientesRepo extends JpaRepository<Ingredientes, Long> {

}
