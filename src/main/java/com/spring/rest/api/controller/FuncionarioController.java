package com.spring.rest.api.controller;

import com.spring.rest.api.dto.DadosEditados;
import com.spring.rest.api.dto.DadosFuncionarioCadastro;
import com.spring.rest.api.dto.DadosListagem;
import com.spring.rest.api.model.Funcionario;
import com.spring.rest.api.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosFuncionarioCadastro dados) {
        Funcionario funcionario = new Funcionario(dados);
        repository.save(funcionario);
    }
    @GetMapping
    public List<DadosListagem> listar() {
        return repository.findAll().stream().map(DadosListagem :: new).toList();
    }

    @PutMapping
    @Transactional
    public void alterar(@RequestBody DadosEditados dados) {
        var funcionaio = repository.getReferenceById(dados.id());
        funcionaio.atualizarDados(dados);
    }





}
