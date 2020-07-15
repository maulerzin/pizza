package com.crud.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.pizza.model.MiddleTable;


@Repository
public interface MiddleTableRepo extends JpaRepository<MiddleTable, Long> {

}
