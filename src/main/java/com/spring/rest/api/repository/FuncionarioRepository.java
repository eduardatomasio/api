package com.spring.rest.api.repository;

import com.spring.rest.api.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
}
