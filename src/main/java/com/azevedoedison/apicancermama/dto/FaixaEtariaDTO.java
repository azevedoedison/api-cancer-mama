package com.azevedoedison.apicancermama.dto;

import javax.validation.constraints.Size;

public class FaixaEtariaDTO {
	
	private Long faixaI;
	private Long faixaN;
	@Size(max = 50)
	private String descricao;
	
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
