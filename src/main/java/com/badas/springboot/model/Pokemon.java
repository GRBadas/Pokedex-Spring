package com.badas.springboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.ToString;

@Document
@Data @ToString
public class Pokemon {
	
	@Id
	private String id;
	
	private String nome;
	
	private String categoria;
	
	private String habilidade;
	
	private Double peso;

}
