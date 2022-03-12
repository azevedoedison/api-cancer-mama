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

import com.azevedoedison.apicancermama.model.FaixaEtariaModel;
import com.azevedoedison.apicancermama.service.FaixaEtariaService;

@RestController
@RequestMapping("/api/faixa-etaria")
public class FaixaEtariaController {
	
	
	final FaixaEtariaService faixaEtariaService;
	
	public FaixaEtariaController(FaixaEtariaService faixaEtariaService) {
		this.faixaEtariaService = faixaEtariaService;
	}
	
	@GetMapping
	public ResponseEntity<Page<FaixaEtariaModel>> getAllFaixas(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC)Pageable pageable){		
		return ResponseEntity.status(HttpStatus.OK).body(faixaEtariaService.findAll(pageable));
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getIFaixaEtaria(@PathVariable(value = "id") Long id){
		Optional<FaixaEtariaModel> faixaEtariaModelOptional = faixaEtariaService.findById(id);
		if(!faixaEtariaModelOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Faixa Etaria not found");
		}
		return ResponseEntity.status(HttpStatus.OK).body(faixaEtariaModelOptional.get());
	}
	
	

}
