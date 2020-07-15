package com.crud.pizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.crud.pizza.model.TipoMassa;
import com.crud.pizza.repository.TipoMassaRepo;

@Service
public class TipoMassaService {
	
	@Autowired
	TipoMassaRepo tipoMassaRepo;
	
	public 	TipoMassa add(TipoMassa tipoMassa) {
		return tipoMassaRepo.save(tipoMassa);
	}
	
	public List<TipoMassa> getAll(){
		List<TipoMassa> list = tipoMassaRepo.findAll();
			if(list.isEmpty()) {
				throw new ResponseStatusException(HttpStatus.NO_CONTENT);
			}
			
			return list;
	}

}
