package tn.grp3DL1.banque.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("v")
public class Versement extends Operation implements Serializable {

	public Versement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Versement(Long id, Date dateOperation, double montant, Compte compte, Extrait_bancaire extrait_bancaire) {
		super(id, dateOperation, montant, compte, extrait_bancaire);
		// TODO Auto-generated constructor stub
	}

	public Versement(Long id, Date dateOperation, double montant) {
		super(id, dateOperation, montant);
		// TODO Auto-generated constructor stub
	}

	public Versement(Date dateOperation, double montant, Compte compte) {
		super(dateOperation, montant, compte);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Versement [getId()=" + getId() + ", getDateOperation()=" + getDateOperation() + ", getMontant()="
				+ getMontant() + ", getCompte()=" + getCompte() + ", getExtrait_bancaire()=" + getExtrait_bancaire()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	
	

	
}
