package com.azevedoedison.apicancermama.service;

import java.util.Optional;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.azevedoedison.apicancermama.model.IncidenciaModel;
import com.azevedoedison.apicancermama.repository.IncidenciaRepository;


@Service
public class IncidenciaService {
	
	final IncidenciaRepository incidenciaRepository;
	
	public IncidenciaService(IncidenciaRepository incidenciaRepository) {
		this.incidenciaRepository = incidenciaRepository;
	}
	
	public Page<IncidenciaModel> findAll(Pageable pageable) {		
		return incidenciaRepository.findAll(pageable);
	}

	public Optional<IncidenciaModel> findById(Long id) {
		return incidenciaRepository.findById(id);
	}

}
