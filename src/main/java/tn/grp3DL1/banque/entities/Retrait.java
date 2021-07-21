package tn.grp3DL1.banque.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("retrait")
public class Retrait extends Operation implements Serializable {

	public Retrait() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
