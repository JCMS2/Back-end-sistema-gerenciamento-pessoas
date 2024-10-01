package com.universidade.gerenciamentopessoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universidade.gerenciamentopessoas.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}