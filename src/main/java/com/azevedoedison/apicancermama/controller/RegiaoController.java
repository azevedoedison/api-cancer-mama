package com.azevedoedison.apicancermama.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.azevedoedison.apicancermama.model.RegiaoModel;
import com.azevedoedison.apicancermama.service.RegiaoService;

@RestController
@RequestMapping("/api/regiao")
public class RegiaoController {

	final RegiaoService regiaoService;
	
	public RegiaoController(RegiaoService regiaoService) {
		this.regiaoService = regiaoService;
	}
	
	@GetMapping
	public ResponseEntity<Page<RegiaoModel>> getAllRegioes(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable){		
		return ResponseEntity.status(HttpStatus.OK).body(regiaoService.findAll(pageable));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getRegiao(@PathVariable(value = "id") Long id){
		Optional<RegiaoModel> regiaoModelOptional = regiaoService.findById(id);
		if(!regiaoModelOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Regiao not found");
		}
		return ResponseEntity.status(HttpStatus.OK).body(regiaoModelOptional.get());
	}
	
	
	
		
	
}
