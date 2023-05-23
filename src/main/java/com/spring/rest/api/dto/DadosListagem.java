package com.spring.rest.api.dto;

import com.spring.rest.api.model.Funcionario;

public record DadosListagem(String nome, String email, String telefone) {
    public DadosListagem(Funcionario funcionario) {
        this(funcionario.getNome(), funcionario.getEmail(), funcionario.getTelefone());
    }
}
