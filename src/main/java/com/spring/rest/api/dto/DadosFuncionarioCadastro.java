package com.spring.rest.api.dto;

import com.spring.rest.api.model.Endereco;

public record DadosFuncionarioCadastro(String nome, String email, String telefone, DadosEnderecoCadastro endereco) {
}
