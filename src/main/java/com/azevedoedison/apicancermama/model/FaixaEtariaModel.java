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
	@GeneratedValue(strategy =  GenerationType.AUTO )
	@Column(nullable = false)
	private Long id;
	@Column
	private Long faixa_i;
	@Column
	private Long faixa_n;
	@Column
	private String descricao;
	
	
	
	public FaixaEtariaModel(Long faixa_i, Long faixa_n, String descricao) {
		super();
		this.faixa_i = faixa_i;
		this.faixa_n = faixa_n;
		this.descricao = descricao;
	}
	
	public FaixaEtariaModel() {
	}
	
	public Long getId() {
		return id;
	}
	
	public Long getFaixa_i() {
		return faixa_i;
	}
	public void setFaixa_i(Long faixa_i) {
		this.faixa_i = faixa_i;
	}
	public Long getFaixa_n() {
		return faixa_n;
	}
	public void setFaixa_n(Long faixa_n) {
		this.faixa_n = faixa_n;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
