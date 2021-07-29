package tn.grp3DL1.banque.entities;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_COMPTE")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,include=JsonTypeInfo.As.PROPERTY,
property="type_cpte")
@JsonSubTypes({@Type(name="CC",value=Compte_courant.class),
	@Type(name="CE",value=Compte_epargne.class)
})
public class Compte implements Serializable   {
	
	@Id
	protected String numeroCompte;

	@Temporal (TemporalType.DATE)
	protected Date   date_ouverture;
	protected String nom;
	protected String prenom;
	@Temporal (TemporalType.DATE)
	protected Date date_naissance;	
	protected String Adresse;
	protected int tel;
	protected String cin;
	protected double solde;
	@ManyToOne
	@JsonIgnore
	protected Agence agence;
	@ManyToOne
	@JsonIgnore
	protected Client client;
	@OneToMany(mappedBy="compte",fetch=FetchType.LAZY)
	@JsonIgnore
	protected List <Operation> operations;
	public Compte() {
		super();
	}
	public Compte(String numeroCompte, Date date_ouverture, String nom, String prenom, Date date_naissance,
			String adresse, int tel, String cin, double solde, Agence agence, Client client,
			List<Operation> operations) {
		super();
		this.numeroCompte = numeroCompte;
		this.date_ouverture = date_ouverture;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
		Adresse = adresse;
		this.tel = tel;
		this.cin = cin;
		this.solde = solde;
		this.agence = agence;
		this.client = client;
		this.operations = operations;
	}
	public String getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public Date getDate_ouverture() {
		return date_ouverture;
	}
	public void setDate_ouverture(Date date_ouverture) {
		this.date_ouverture = date_ouverture;
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
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Agence getAgence() {
		return agence;
	}
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<Operation> getOperations() {
		return operations;
	}
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	@Override
	public String toString() {
		return "Compte [numeroCompte=" + numeroCompte + ", date_ouverture=" + date_ouverture + ", nom=" + nom
				+ ", prenom=" + prenom + ", date_naissance=" + date_naissance + ", Adresse=" + Adresse + ", tel=" + tel
				+ ", cin=" + cin + ", solde=" + solde + ", agence=" + agence + ", client=" + client + ", operations="
				+ operations + "]";
	}

	
	
	
	
}
