package com.badas.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;

import com.badas.springboot.model.Pokemon;
import com.badas.springboot.repository.PokedexRepository;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class SpringbootBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
		
	}
	
	CommandLineRunner init(ReactiveMongoOperations operations,
			PokedexRepository repository) {
		return args -> {
			Flux<Pokemon> pokedexFlux = Flux.just(
							new Pokemon("Bulbasaur", "Semente", "OverGrow", 6.09),
                            new Pokemon("Charmander", "Fogo", "Blaze", 90.05),
                            new Pokemon("Caterpie", "Minhoca", "Poeira de escudo", 2.09),
                            new Pokemon("Blastoise", "Marisco", "Torrente", 6.09))
					)
		}
	}

}
