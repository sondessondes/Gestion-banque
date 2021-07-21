package tn.grp3DL1.banque.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Pack1")

public class Pack1 extends Pack implements Serializable {

	public Pack1() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Pack1(Long id, Long cmpt_depot, Long cmpt_epargne, Long crt_liberte, Boolean cmpt_distance,
			Boolean assurance) {
		super(id, cmpt_depot, cmpt_epargne, crt_liberte, cmpt_distance, assurance);
		// TODO Auto-generated constructor stub
	}
	
	

}
