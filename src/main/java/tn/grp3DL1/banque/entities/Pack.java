package tn.grp3DL1.banque.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Pack implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Long cmpt_depot;
	private Long cmpt_epargne;
	private Long crt_liberte;

	private Boolean cmpt_distance;
	private Boolean assurance;
	
	@OneToOne
	private Client client;
	public Pack() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Pack(Long cmpt_depot, Long cmpt_epargne, Long crt_liberte, Boolean cmpt_distance, Boolean assurance,
			Client client) {
		super();
		this.cmpt_depot = cmpt_depot;
		this.cmpt_epargne = cmpt_epargne;
		this.crt_liberte = crt_liberte;
		this.cmpt_distance = cmpt_distance;
		this.assurance = assurance;
		this.client = client;
	}



	public Pack(Long id, Long cmpt_depot, Long cmpt_epargne, Long crt_liberte, Boolean cmpt_distance,
			Boolean assurance) {
		super();
		this.id = id;
		this.cmpt_depot = cmpt_depot;
		this.cmpt_epargne = cmpt_epargne;
		this.crt_liberte = crt_liberte;
		this.cmpt_distance = cmpt_distance;
		this.assurance = assurance;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCmpt_depot() {
		return cmpt_depot;
	}
	public void setCmpt_depot(Long cmpt_depot) {
		this.cmpt_depot = cmpt_depot;
	}
	public Long getCmpt_epargne() {
		return cmpt_epargne;
	}
	public void setCmpt_epargne(Long cmpt_epargne) {
		this.cmpt_epargne = cmpt_epargne;
	}
	public Long getCrt_liberte() {
		return crt_liberte;
	}
	public void setCrt_liberte(Long crt_liberte) {
		this.crt_liberte = crt_liberte;
	}
	public Boolean getCmpt_distance() {
		return cmpt_distance;
	}
	public void setCmpt_distance(Boolean cmpt_distance) {
		this.cmpt_distance = cmpt_distance;
	}
	public Boolean getAssurance() {
		return assurance;
	}
	public void setAssurance(Boolean assurance) {
		this.assurance = assurance;
	}



	public Client getClient() {
		return client;
	}



	public void setClient(Client client) {
		this.client = client;
	}
	
	

}
