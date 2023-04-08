package com.badas.springboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.ToString;

@Document
@ToString
@Data
public class Pokemon {
	
	@Id
	private String id;
	
	private String nome;
	
	private String categoria;
	
	private String habilidade;
	
	private Double peso;
	
	 public Pokemon(String id, String nome, String categoria, String habilidades, Double peso) {
	        this.id = id;
	        this.nome = nome;
	        this.categoria = categoria;
	        this.habilidade = habilidades;
	        this.peso = peso;
	    }

}
