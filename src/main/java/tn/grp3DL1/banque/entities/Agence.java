package tn.grp3DL1.banque.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Agence implements Serializable {

	@Id	
	private Long code_agence;
	private String nom_agence;
	private String adresse_agence;
	private	int telephone;
	
	@OneToMany(mappedBy="agence",fetch=FetchType.LAZY)
	private List <Compte> comptes;
	
	@ManyToOne
	private Banque banque;
	
	public Agence() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Agence(Long code_agence, String nom_agence, String adresse_agence, int telephone, List<Compte> comptes,
			Banque banque) {
		super();
		this.code_agence = code_agence;
		this.nom_agence = nom_agence;
		this.adresse_agence = adresse_agence;
		this.telephone = telephone;
		this.comptes = comptes;
		this.banque = banque;
	}




	public Long getCode_agence() {
		return code_agence;
	}
	public void setCode_agence(Long code_agence) {
		this.code_agence = code_agence;
	}
	public String getNom_agence() {
		return nom_agence;
	}
	public void setNom_agence(String nom_agence) {
		this.nom_agence = nom_agence;
	}
	public String getAdresse_agence() {
		return adresse_agence;
	}
	public void setAdresse_agence(String adresse_agence) {
		this.adresse_agence = adresse_agence;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}






	public List<Compte> getComptes() {
		return comptes;
	}






	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}




	public Banque getBanque() {
		return banque;
	}




	public void setBanque(Banque banque) {
		this.banque = banque;
	}



	
	
	


}
