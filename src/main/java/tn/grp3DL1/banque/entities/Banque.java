package tn.grp3DL1.banque.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Banque implements Serializable {

	@Id
	private Long code_siege;
	
	private String nom_siege;
	private String adresse_siege;
	private int telefax;
	
	@OneToMany(mappedBy="banque",fetch= FetchType.LAZY)
	private Set<Agence> agences;
	
	
	public Banque() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	


	public Banque(Long code_siege, String nom_siege, String adresse_siege, int telefax, Set<Agence> agences) {
		super();
		this.code_siege = code_siege;
		this.nom_siege = nom_siege;
		this.adresse_siege = adresse_siege;
		this.telefax = telefax;
		this.agences = agences;
	}







	public Long getCode_siege() {
		return code_siege;
	}

	public void setCode_siege(Long code_siege) {
		this.code_siege = code_siege;
	}

	public String getNom_siege() {
		return nom_siege;
	}

	public void setNom_siege(String nom_siege) {
		this.nom_siege = nom_siege;
	}

	public String getAdresse_siege() {
		return adresse_siege;
	}

	public void setAdresse_siege(String adresse_siege) {
		this.adresse_siege = adresse_siege;
	}

	public int getTelefax() {
		return telefax;
	}

	public void setTelefax(int telefax) {
		this.telefax = telefax;
	}






	public Set<Agence> getAgences() {
		return agences;
	}






	public void setAgences(Set<Agence> agences) {
		this.agences = agences;
	}
	
	
	
	
}
