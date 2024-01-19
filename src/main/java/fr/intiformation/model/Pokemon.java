package fr.intiformation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pokemon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String type;
	private Long ptVie;
	
	
	public Pokemon() {
	}


	public Pokemon(String nom, String type, Long ptVie) {
		this.nom = nom;
		this.type = type;
		this.ptVie = ptVie;
	}


	public Pokemon(Long id, String nom, String type, Long ptVie) {
		this.id = id;
		this.nom = nom;
		this.type = type;
		this.ptVie = ptVie;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Long getPtVie() {
		return ptVie;
	}


	public void setPtVie(Long ptVie) {
		this.ptVie = ptVie;
	}


	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", nom=" + nom + ", type=" + type + ", ptVie=" + ptVie + "]";
	}
	
	
	
	
}
