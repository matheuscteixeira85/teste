package com.example.teste.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.teste.dtos.PessoaDTO;
import com.example.teste.model.Pessoa;
import com.example.teste.services.PessoaService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	PessoaService pessoaService;
	
	@PostMapping
	public ResponseEntity<Object> savePessoa(@RequestBody @Valid PessoaDTO pessoaDTO){
		//VERIFICAR REGISTROS UNICOS REPETIDOS
		if(pessoaService.existsByCpf(pessoaDTO.getCpf())) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflito: Pessoa com este CPF já cadastrada!");
		}
		
		var pessoa = new Pessoa();
		BeanUtils.copyProperties(pessoaDTO, pessoa);
		pessoa.setDataRegistro(LocalDateTime.now(ZoneId.of("UTC")));
		return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.save(pessoa));
	}
	
}
