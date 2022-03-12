package com.azevedoedison.apicancermama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.azevedoedison.apicancermama.model.RegiaoModel;

@Repository
public interface RegiaoRepository extends JpaRepository<RegiaoModel, Long>{

}
