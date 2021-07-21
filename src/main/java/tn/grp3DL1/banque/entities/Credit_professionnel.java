package tn.grp3DL1.banque.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Credit_professionnel")
public class Credit_professionnel extends Crédit implements Serializable {

	public Credit_professionnel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Credit_professionnel(String type, String duree_echeance, Long montant_crédit, Long echeance_mois,
			Nature_taux nature) {
		super(type, duree_echeance, montant_crédit, echeance_mois, nature);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
