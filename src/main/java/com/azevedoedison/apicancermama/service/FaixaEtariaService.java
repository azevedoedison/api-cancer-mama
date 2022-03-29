package com.azevedoedison.apicancermama.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
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

	@Transactional
	public void delete(FaixaEtariaModel faixaEtariaModel) {
		faixaEtariaRepository.delete(faixaEtariaModel);
	}
	
	@Transactional
	public FaixaEtariaModel save(FaixaEtariaModel faixaEtariaModel) {
		return faixaEtariaRepository.save(faixaEtariaModel);
	}	

	public boolean existsByFaixa_iAndFaixa_n(Long faixa_i, Long faixa_n) {		
		return faixaEtariaRepository.existsByFaixaIAndFaixaN(faixa_i,faixa_n);
	}
	
}
