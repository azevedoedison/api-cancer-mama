package com.azevedoedison.apicancermama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.azevedoedison.apicancermama.model.FaixaEtariaModel;

@Repository
public interface FaixaEtariaRepository extends JpaRepository<FaixaEtariaModel, Long>{

}
