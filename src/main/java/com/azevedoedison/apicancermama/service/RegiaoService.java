package com.azevedoedison.apicancermama.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.azevedoedison.apicancermama.model.RegiaoModel;
import com.azevedoedison.apicancermama.repository.RegiaoRepository;

@Service
public class RegiaoService {
	
	final RegiaoRepository regiaoRepository;
	
	public RegiaoService (RegiaoRepository regiaoRepository) {
		this.regiaoRepository = regiaoRepository;
	}
	
	public Optional<RegiaoModel> findById(Long id){
		return regiaoRepository.findById(id);
	}
	
	public Page<RegiaoModel> findAll(Pageable pageable){
		return regiaoRepository.findAll(pageable);
	}

}
