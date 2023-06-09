package com.spring.rest.api.model;

import com.spring.rest.api.dto.DadosEnderecoCadastro;
import com.spring.rest.api.dto.DadosFuncionarioCadastro;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;

@Embeddable
public class Endereco {
	@NotBlank
	private String cep;
	private String numero;
	@NotBlank
	private String bairro;
	@NotBlank
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
	public Endereco(DadosEnderecoCadastro dados) { //Construtor para cadastro
		this.cep = dados.cep();
		this.numero = dados.numero();
		this.bairro = dados.bairro();
		this.cidade = dados.cidade();
	}

	public Endereco(Endereco dados) { //Construtor para alteração cadastro
		this.cep = dados.cep;
		this.numero = dados.numero;
		this.bairro = dados.bairro;
		this.cidade = dados.cidade;
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

	public void atualizarDados(Endereco dados) {
		if(dados.cep != null) {
			this.cep = dados.cep;
		}
		if(dados.numero != null) {
			this.numero = dados.numero;
		}
		if(dados.bairro != null) {
			this.bairro = dados.bairro;
		}
		if(dados.cidade != null) {
			this.cidade = dados.cidade;
		}
	}
}
