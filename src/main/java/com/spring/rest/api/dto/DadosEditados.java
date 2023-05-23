package com.spring.rest.api.dto;

import com.spring.rest.api.model.Endereco;

public record DadosEditados(Long id, String nome, String email, String telefone, Endereco endereco) {
}
