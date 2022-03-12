package com.azevedoedison.apicancermama.controller;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azevedoedison.apicancermama.model.IncidenciaModel;
import com.azevedoedison.apicancermama.service.IncidenciaService;

@RestController
@RequestMapping("/api/incidencia")
public class IncidenciaController {
		
	final IncidenciaService incidenciaService;
	
	public IncidenciaController (IncidenciaService incidenciaService) {
		this.incidenciaService = incidenciaService;
	}
	
	@GetMapping
	public ResponseEntity<Page<IncidenciaModel>> getAllIncidencias(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable){		
		return ResponseEntity.status(HttpStatus.OK).body(incidenciaService.findAll(pageable));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getIncidencia(@PathVariable(value = "id") Long id){
		Optional<IncidenciaModel> incidenciaModelOptional = incidenciaService.findById(id);
		if(!incidenciaModelOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Incidencia not found");
		}
		return ResponseEntity.status(HttpStatus.OK).body(incidenciaModelOptional.get());
	}

}
