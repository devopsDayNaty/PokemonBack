package fr.intiformation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.intiformation.dao.PokemonRepository;
import fr.intiformation.model.Pokemon;

@Service
public class PokemonService {

	@Autowired
	PokemonRepository pokemonRepository;
	
	public Pokemon addPokemon(Pokemon pokemon) {
		return pokemonRepository.save(pokemon);
	}
	
	public Pokemon updatePokemon(Pokemon pokemon) {
		return pokemonRepository.save(pokemon);
	}
	
	public void deletePokemon(Long id) {
		 pokemonRepository.deleteById(id);
	}
	
	public List<Pokemon> getAllPokemon(){
		return pokemonRepository.findAll();
	}
	
	public Pokemon getPokemonById(Long id) {
	 Optional<Pokemon> optPokemon	=  pokemonRepository.findById(id);
	 Pokemon pokemon = null;
	 if (optPokemon.isPresent()) {
		 pokemon = optPokemon.get();
	 }
	 return pokemon;
	}
}
