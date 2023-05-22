package com.spring.rest.api.model;

import com.spring.rest.api.dto.DadosEnderecoCadastro;
import com.spring.rest.api.dto.DadosFuncionarioCadastro;
import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {
	
	private String cep;
	private String numero;
	private String bairro;
	private String cidade;
	
	public Endereco(String cep, String numero, String bairro, String cidade) {
		super();
		this.cep = cep;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public Endereco() {

	}

	public Endereco(DadosEnderecoCadastro dados) {
		this.cep = dados.cep();
		this.numero = dados.numero();
		this.bairro = dados.bairro();
		this.cidade = dados.cidade();
	}


	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
