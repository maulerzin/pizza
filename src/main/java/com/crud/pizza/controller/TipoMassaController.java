package com.crud.pizza.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.pizza.model.TipoMassa;
import com.crud.pizza.service.TipoMassaService;

@RestController
@RequestMapping(value="/tipomassa")
public class TipoMassaController {

	@Autowired
	TipoMassaService tipoMassaService;

	public TipoMassa add(@RequestBody TipoMassa tipoMassa) {

		return tipoMassaService.add(tipoMassa);

	}

	@GetMapping(value = "/all")
	public List<TipoMassa> getAll() {
		return tipoMassaService.getAll();
	}

}
