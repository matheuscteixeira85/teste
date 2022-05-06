package com.example.teste.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	@Column(nullable = false, unique = true,length = 11)
	private String cpf;
	@Column(nullable = false, length = 50)
	private String nome;
	@Column(nullable = false, length = 130)
	private LocalDateTime dataRegistro;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
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
	
	public LocalDateTime getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(LocalDateTime dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
