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

	public Pack1(Long cmpt_depot, Long cmpt_epargne, Long crt_liberte, Boolean cmpt_distance, Boolean assurance,
			Client client) {
		super(cmpt_depot, cmpt_epargne, crt_liberte, cmpt_distance, assurance, client);
		// TODO Auto-generated constructor stub
	}

	public Pack1(Long id, Long cmpt_depot, Long cmpt_epargne, Long crt_liberte, Boolean cmpt_distance,
			Boolean assurance) {
		super(id, cmpt_depot, cmpt_epargne, crt_liberte, cmpt_distance, assurance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pack1 [getId()=" + getId() + ", getCmpt_depot()=" + getCmpt_depot() + ", getCmpt_epargne()="
				+ getCmpt_epargne() + ", getCrt_liberte()=" + getCrt_liberte() + ", getCmpt_distance()="
				+ getCmpt_distance() + ", getAssurance()=" + getAssurance() + ", getClient()=" + getClient()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	

}
