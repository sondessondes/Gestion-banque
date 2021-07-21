package tn.grp3DL1.banque.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("client")
public class Client implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String cin;
	private String nom;
	private String prenom;
	private String profession;
	private String adresse;
	private String mail;
	
	@OneToMany(mappedBy="client",fetch= FetchType.LAZY)
	private Collection <Compte> comptes; 

	@OneToMany(mappedBy="client",fetch= FetchType.LAZY)
	private Collection <Extrait_bancaire> extrait_bancaires; 
	
	@OneToMany(mappedBy="client",fetch= FetchType.LAZY)
	private Collection <Crédit> crédits;
	
	@OneToOne
	private Pack pack;
	
	
	@Enumerated(EnumType.STRING)
	private  Type_clt cible;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	


	public Collection<Crédit> getCrédits() {
		return crédits;
	}



	public void setCrédits(Collection<Crédit> crédits) {
		this.crédits = crédits;
	}



	public Pack getPack() {
		return pack;
	}



	public void setPack(Pack pack) {
		this.pack = pack;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Collection<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
	public Collection<Extrait_bancaire> getFactures() {
		return extrait_bancaires;
	}
	public void setFactures(Collection<Extrait_bancaire> extrait_bancaires) {
		this.extrait_bancaires = extrait_bancaires;
	}
	
	
	public Type_clt getCible() {
		return cible;
	}
	public void setCible(Type_clt cible) {
		this.cible = cible;
	}

	
	



}
