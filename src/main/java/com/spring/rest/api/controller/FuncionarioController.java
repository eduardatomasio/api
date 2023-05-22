package com.spring.rest.api.controller;

import com.spring.rest.api.dto.DadosFuncionarioCadastro;
import com.spring.rest.api.model.Funcionario;
import com.spring.rest.api.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository repository;

}
