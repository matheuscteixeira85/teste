package com.example.teste.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class PessoaDTO {


	@NotBlank
	@Size(max=11)
	private String cpf;
	@NotBlank
	@Size(max=50)
	private String nome;
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
