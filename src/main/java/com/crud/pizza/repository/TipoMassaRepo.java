package com.crud.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.pizza.model.TipoMassa;

@Repository
public interface TipoMassaRepo extends JpaRepository<TipoMassa, Long> {

}
