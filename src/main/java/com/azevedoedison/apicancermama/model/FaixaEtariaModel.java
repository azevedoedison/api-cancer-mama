package com.azevedoedison.apicancermama.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="FAIXA_ETARIA")
public class FaixaEtariaModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	@Column
	private Long faixaI;
	@Column
	private Long faixaN;
	@Column
	private String descricao;
	
	
	
	public FaixaEtariaModel(Long id, Long faixaI, Long faixaN, String descricao) {
		this.id = id;
		this.faixaI = faixaI;
		this.faixaN = faixaN;
		this.descricao = descricao;
	}
	
	public FaixaEtariaModel( Long faixaI, Long faixaN, String descricao) {
		this.faixaI = faixaI;
		this.faixaN = faixaN;
		this.descricao = descricao;
	}
	
	
	
	public FaixaEtariaModel() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	
	
	public Long getFaixaI() {
		return faixaI;
	}

	public void setFaixaI(Long faixaI) {
		this.faixaI = faixaI;
	}

	public Long getFaixaN() {
		return faixaN;
	}

	public void setFaixaN(Long faixaN) {
		this.faixaN = faixaN;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	

}
