package tn.grp3DL1.banque.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
@Entity

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_OP")
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,include=JsonTypeInfo.As.PROPERTY,
property="type_oper")
@JsonSubTypes({@Type(name="v",value=Versement.class),
	@Type(name="r",value=Retrait.class)})

public class Operation implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long id;
	
	@Temporal (TemporalType.DATE)
	protected Date dateOperation;
	protected double montant;
	
	
	@ManyToOne
	@JsonIgnore
	protected Compte compte;
	
	@OneToOne
	@JsonIgnore
	protected Extrait_bancaire extrait_bancaire;
	/*@ManyToOne
	@JsonIgnore
	protected  Client code_client;*/
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operation(Long id, Date dateOperation, double montant, Compte compte, Extrait_bancaire extrait_bancaire) {
		super();
		this.id = id;
		this.dateOperation = dateOperation;
		this.montant = montant;
		this.compte = compte;
		this.extrait_bancaire = extrait_bancaire;
	}

	public Operation(Date dateOperation, double montant, Compte compte) {
		super();
		this.dateOperation = dateOperation;
		this.montant = montant;
		this.compte = compte;
	}

	public Operation(Long id, Date dateOperation, double montant) {
		super();
		this.id = id;
		this.dateOperation = dateOperation;
		this.montant = montant;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Extrait_bancaire getExtrait_bancaire() {
		return extrait_bancaire;
	}

	public void setExtrait_bancaire(Extrait_bancaire extrait_bancaire) {
		this.extrait_bancaire = extrait_bancaire;
	}

	@Override
	public String toString() {
		return "Operation [id=" + id + ", dateOperation=" + dateOperation + ", montant=" + montant + ", compte="
				+ compte + ", extrait_bancaire=" + extrait_bancaire + "]";
	}

	
}
