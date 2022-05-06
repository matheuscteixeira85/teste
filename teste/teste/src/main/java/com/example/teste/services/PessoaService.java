package com.example.teste.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teste.model.Pessoa;
import com.example.teste.repositories.PessoaRepositorie;

@Service
public class PessoaService {

	@Autowired
	PessoaRepositorie pessoaRepositorie;
	
	@Transactional
	public Pessoa save(Pessoa pessoa) {
		return pessoaRepositorie.save(pessoa);
	}

	public boolean existsByCpf(String cpf) {
		// TODO Auto-generated method stub
		return pessoaRepositorie.existsByCpf(cpf);
	}
	
}
