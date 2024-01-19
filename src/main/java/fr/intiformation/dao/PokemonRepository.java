package fr.intiformation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.intiformation.model.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

}
