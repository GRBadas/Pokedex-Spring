package com.badas.springboot.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.badas.springboot.model.Pokemon;

public interface PokedexRepository extends ReactiveMongoRepository<Pokemon, String>{

}
