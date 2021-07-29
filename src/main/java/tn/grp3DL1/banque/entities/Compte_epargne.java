package tn.grp3DL1.banque.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CE")
public class Compte_epargne extends Compte implements Serializable {

private	double tauxInterets;

public Compte_epargne() {
	super();
	// TODO Auto-generated constructor stub
}

public Compte_epargne(String numeroCompte, Date date_ouverture, String nom, String prenom, Date date_naissance,
		String adresse, int tel, String cin, double solde, Agence agence, Client client, List<Operation> operations,
		double tauxInterets) {
	super(numeroCompte, date_ouverture, nom, prenom, date_naissance, adresse, tel, cin, solde, agence, client,
			operations);
	this.tauxInterets = tauxInterets;
}

public double getTauxInterets() {
	return tauxInterets;
}

public void setTauxInterets(double tauxInterets) {
	this.tauxInterets = tauxInterets;
}

@Override
public String toString() {
	return "Compte_epargne [tauxInterets=" + tauxInterets + "]";
}



}
