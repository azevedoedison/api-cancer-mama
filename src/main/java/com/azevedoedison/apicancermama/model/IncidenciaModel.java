package com.azevedoedison.apicancermama.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Id;
import javax.persistence.Table;



@Table(name="INCIDENCIA_EXAME")
@Entity
public class IncidenciaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long id;
	private Integer regiao_id;
	private Integer mes;
	private Long faixa_id;
	private Integer qnt_exame;

	public IncidenciaModel(Long id, Integer regiao_id, Integer mes, Long faixa_id, Integer qnt_exame) {
		this.id = id;
		this.regiao_id = regiao_id;
		this.mes = mes;
		this.faixa_id = faixa_id;
		this.qnt_exame = qnt_exame;
	}

	public IncidenciaModel() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getRegiao_id() {
		return regiao_id;
	}
	public void setRegiao_id(Integer regiao_id) {
		this.regiao_id = regiao_id;
	}
	public Integer getMes() {
		return mes;
	}
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	public Long getFaixa_id() {
		return faixa_id;
	}
	public void setFaixa_id(Long faixa_id) {
		this.faixa_id = faixa_id;
	}
	public Integer getQnt_exame() {
		return qnt_exame;
	}
	public void setQnt_exame(Integer qnt_exame) {
		this.qnt_exame = qnt_exame;
	}
	
	
	

}
