package tn.grp3DL1.banque.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Extrait_bancaire implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String type_facture;
	@Temporal (TemporalType.DATE)
	private Date date_facture;
	private double montant_verse;
	private double montant_retrait;
	
	@ManyToOne
	private Client client;
	
	@OneToOne
	private Operation operation;
	
	public Extrait_bancaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType_facture() {
		return type_facture;
	}
	public void setType_facture(String type_facture) {
		this.type_facture = type_facture;
	}

	public Date getDate_facture() {
		return date_facture;
	}
	public void setDate_facture(Date date_facture) {
		this.date_facture = date_facture;
	}
	public double getMontant_verse() {
		return montant_verse;
	}
	public void setMontant_verse(double montant_verse) {
		this.montant_verse = montant_verse;
	}
	public double getMontant_retrait() {
		return montant_retrait;
	}
	public void setMontant_retrait(double montant_retrait) {
		this.montant_retrait = montant_retrait;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	

	
}
