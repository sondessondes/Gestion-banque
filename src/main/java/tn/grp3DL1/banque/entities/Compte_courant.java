package tn.grp3DL1.banque.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Compte_courant")
public class Compte_courant  extends Compte implements Serializable {
public Compte_courant() {
		super();
		// TODO Auto-generated constructor stub
	}

private	double montantDecouvertAutorise;

public Compte_courant(double montantDecouvertAutorise) {
	super();
	this.montantDecouvertAutorise = montantDecouvertAutorise;
}

public double getMontantDecouvertAutorise() {
	return montantDecouvertAutorise;
}

public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
	this.montantDecouvertAutorise = montantDecouvertAutorise;
}

	

}
