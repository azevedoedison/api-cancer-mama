package com.azevedoedison.apicancermama.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="REGIAO")
public class RegiaoModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long id;
	private String regiao;
	private Long qnt_exame;
	private int totalExames;
	
	
	public RegiaoModel(String regiao, Long qnt_exame, int totalExames) {
		super();
		this.regiao = regiao;
		this.qnt_exame = qnt_exame;
		this.totalExames = totalExames;
	}
	
	public RegiaoModel() {		
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public Long getQnt_exame() {
		return qnt_exame;
	}
	public void setQnt_exame(Long qnt_exame) {
		this.qnt_exame = qnt_exame;
	}

	public int getTotalExames() {
		return totalExames;
	}

	public void setTotalExames(int totalExames) {
		this.totalExames = totalExames;
	}
	
	
}
