package tn.grp3DL1.banque.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Crédit implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String type;
	private String duree_echeance;
	private Long montant_crédit;
	private Long echeance_mois;
	
	@Enumerated(EnumType.STRING)
	private  Nature_taux nature;
	
	@ManyToOne
	private Client client;

	public Crédit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Crédit( String type, String duree_echeance, Long montant_crédit, Long echeance_mois,
			Nature_taux nature) {
		super();
		this.type = type;
		this.duree_echeance = duree_echeance;
		this.montant_crédit = montant_crédit;
		this.echeance_mois = echeance_mois;
		this.nature = nature;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDuree_echeance() {
		return duree_echeance;
	}

	public void setDuree_echeance(String duree_echeance) {
		this.duree_echeance = duree_echeance;
	}

	public Long getMontant_crédit() {
		return montant_crédit;
	}

	public void setMontant_crédit(Long montant_crédit) {
		this.montant_crédit = montant_crédit;
	}

	public Long getEcheance_mois() {
		return echeance_mois;
	}

	public void setEcheance_mois(Long echeance_mois) {
		this.echeance_mois = echeance_mois;
	}

	public Nature_taux getNature() {
		return nature;
	}

	public void setNature(Nature_taux nature) {
		this.nature = nature;
	}
	

	
}
