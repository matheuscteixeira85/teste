package com.example.teste.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.teste.model.Pessoa;

@Repository
public interface PessoaRepositorie extends JpaRepository<Pessoa, UUID>{
	boolean existsByCpf(String cpf);
}
