package tn.grp3DL1.banque.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("administrateur")
public class Administrateur implements Serializable {

	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
