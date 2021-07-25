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
public class Administrateur extends Utilisateur implements Serializable {

	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrateur(Long id, String cin, String nom, String prenom, String mail) {
		super(id, cin, nom, prenom, mail);
		// TODO Auto-generated constructor stub
	}

	
}
