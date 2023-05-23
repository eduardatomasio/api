package com.spring.rest.api.dto;

import com.spring.rest.api.model.Endereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosEditados(
        @NotBlank
        Long id,
        String nome,
        String email,
        String telefone,
        Endereco endereco) {
}
