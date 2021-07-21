package tn.grp3DL1.banque.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Compte_epargne")
public class Compte_epargne extends Compte implements Serializable {

private	double tauxInterets;

public Compte_epargne() {
	super();
	// TODO Auto-generated constructor stub
}

public Compte_epargne(double tauxInterets) {
	super();
	this.tauxInterets = tauxInterets;
}

public double getTauxInterets() {
	return tauxInterets;
}

public void setTauxInterets(double tauxInterets) {
	this.tauxInterets = tauxInterets;
}



}
