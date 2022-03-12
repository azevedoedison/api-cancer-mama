package com.azevedoedison.apicancermama.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.azevedoedison.apicancermama.model.FaixaEtariaModel;
import com.azevedoedison.apicancermama.repository.FaixaEtariaRepository;

@Service
public class FaixaEtariaService {
	
	final FaixaEtariaRepository faixaEtariaRepository;
	
	public FaixaEtariaService(FaixaEtariaRepository faixaEtariaRepository) {
		this.faixaEtariaRepository = faixaEtariaRepository; 
	}
	
	public Optional<FaixaEtariaModel> findById(Long id){
		return faixaEtariaRepository.findById(id);
	}
	
	public Page<FaixaEtariaModel> findAll(Pageable pageable){
		return faixaEtariaRepository.findAll(pageable);
	}

	
	

}
