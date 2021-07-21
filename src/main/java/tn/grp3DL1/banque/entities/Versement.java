package tn.grp3DL1.banque.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("versement")
public class Versement extends Operation implements Serializable {

	public Versement() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
