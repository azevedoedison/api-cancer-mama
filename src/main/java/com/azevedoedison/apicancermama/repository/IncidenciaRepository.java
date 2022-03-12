package com.azevedoedison.apicancermama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.azevedoedison.apicancermama.model.IncidenciaModel;

@Repository
public interface IncidenciaRepository extends JpaRepository<IncidenciaModel, Long>{

}
