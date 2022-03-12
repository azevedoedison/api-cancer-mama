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
	private Integer Regiao_id;
	private Integer Mes;
	private Long Faixa_id;
	private Integer Qnt_exame;
	
	public IncidenciaModel(Integer regiao_id, Integer mes, Long faixa_id, Integer qnt_exame) {
		super();		
		Mes = mes;
		Faixa_id = faixa_id;
		Qnt_exame = qnt_exame;
	}
	
	public IncidenciaModel() {
	}

	public Long getId() {
		return id;
	}
	
	public Integer getRegiao_id() {
		return Regiao_id;
	}
	public void setRegiao_id(Integer regiao_id) {
		Regiao_id = regiao_id;
	}
	public Integer getMes() {
		return Mes;
	}
	public void setMes(Integer mes) {
		Mes = mes;
	}
	public Long getFaixa_id() {
		return Faixa_id;
	}
	public void setFaixa_id(Long faixa_id) {
		Faixa_id = faixa_id;
	}
	public Integer getQnt_exame() {
		return Qnt_exame;
	}
	public void setQnt_exame(Integer qnt_exame) {
		Qnt_exame = qnt_exame;
	}
	
	

}
