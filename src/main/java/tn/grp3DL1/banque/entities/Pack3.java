package tn.grp3DL1.banque.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Pack3")

public class Pack3 extends Pack implements Serializable {
	
	private Long crt_visaGold;

	public Pack3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pack3(Long id, Long cmpt_depot, Long cmpt_epargne, Long crt_liberte, Boolean cmpt_distance,
			Boolean assurance) {
		super(id, cmpt_depot, cmpt_epargne, crt_liberte, cmpt_distance, assurance);
		// TODO Auto-generated constructor stub
	}

	public Pack3(Long crt_visaGold) {
		super();
		this.crt_visaGold = crt_visaGold;
	}

	public Long getCrt_visaGold() {
		return crt_visaGold;
	}

	public void setCrt_visaGold(Long crt_visaGold) {
		this.crt_visaGold = crt_visaGold;
	}

	

}
