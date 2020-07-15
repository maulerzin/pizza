package com.crud.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.pizza.model.Pizza;

@Repository
public interface PizzaRepo extends JpaRepository<Pizza, Long> {

}
