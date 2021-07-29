package tn.grp3DL1.banque.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CC")
public class Compte_courant  extends Compte implements Serializable {


private	double montantDecouvertAutorise;


public Compte_courant() {
	super();
	// TODO Auto-generated constructor stub
}


public Compte_courant(String numeroCompte, Date date_ouverture, String nom, String prenom, Date date_naissance,
		String adresse, int tel, String cin, double solde, Agence agence, Client client, List<Operation> operations) {
	super(numeroCompte, date_ouverture, nom, prenom, date_naissance, adresse, tel, cin, solde, agence, client, operations);
	// TODO Auto-generated constructor stub
}


public Compte_courant(String numeroCompte, Date date_ouverture, String nom, String prenom, Date date_naissance,
		String adresse, int tel, String cin, double solde, Agence agence, Client client, List<Operation> operations,
		double montantDecouvertAutorise) {
	super(numeroCompte, date_ouverture, nom, prenom, date_naissance, adresse, tel, cin, solde, agence, client,
			operations);
	this.montantDecouvertAutorise = montantDecouvertAutorise;
}


public double getMontantDecouvertAutorise() {
	return montantDecouvertAutorise;
}


public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
	this.montantDecouvertAutorise = montantDecouvertAutorise;
}


@Override
public String toString() {
	return "Compte_courant [montantDecouvertAutorise=" + montantDecouvertAutorise + "]";
}



}
