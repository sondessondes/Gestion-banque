package tn.grp3DL1.banque.services;


import java.util.Date;

import java.util.List;

import org.apache.catalina.connector.Connector;
import org.apache.catalina.connector.Request;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.grp3DL1.banque.entities.Agence;
import tn.grp3DL1.banque.entities.Client;
import tn.grp3DL1.banque.entities.Compte;
import tn.grp3DL1.banque.entities.Compte_courant;
import tn.grp3DL1.banque.entities.Compte_epargne;
import tn.grp3DL1.banque.entities.Operation;
import tn.grp3DL1.banque.entities.Retrait;
import tn.grp3DL1.banque.entities.Versement;
import tn.grp3DL1.banque.repository.AgenceRepository;
import tn.grp3DL1.banque.repository.ClientRepository;
import tn.grp3DL1.banque.repository.CompteRepository;
import tn.grp3DL1.banque.repository.operationRepository;
import org.springframework.data.domain.PageRequest;

@Service
@Transactional
public class CompteServicesImpl  implements compteServices{
@Autowired
	ClientRepository clientRepository;
@Autowired
CompteRepository compteRepository;
@Autowired
operationRepository operationrepository;

@Autowired
AgenceRepository agenceRepository;

private static final Logger l = LogManager.getLogger(CompteServicesImpl.class);
	public void ajouterCompte(Compte compte, Long codeCli) {
		// TODO Auto-generated method stub
		Client client =clientRepository.findById(codeCli).get();
		compte.setClient(client);
		compteRepository.save(compte);
			
	}



	@Override
	public Compte consulterCompte(String codeCpte) {
		// TODO Auto-generated method stub
		Compte cp = compteRepository.findById(codeCpte).get();
		if(cp==null) throw new RuntimeException("Compte instrouvable ");
		return cp;
		
	}

	@Override
	public void verser(String codeCpte, double montant) {
		// TODO Auto-generated method stub
		Compte compte = consulterCompte(codeCpte);
		Versement versement = new Versement(new Date(),montant,compte);
	
		operationrepository.save(versement );
		 compte .setSolde( compte .getSolde()+montant);
		compteRepository.save( compte );
		
	}

	@Override
	public void retirer(String codeCpte, double montant) {
		// TODO Auto-generated method stub
Compte compte = consulterCompte(codeCpte);
		
		double facilitesCaisse=0;
	   	if(compte instanceof Compte_courant) 
			facilitesCaisse = ((Compte_courant) compte).getMontantDecouvertAutorise();
		      if(compte.getSolde()+facilitesCaisse<montant) 
					throw new RuntimeException("Solde Insuffisant");
				   
		Retrait retrait = new Retrait(new Date(),montant,compte);
		operationrepository.save(retrait);
		compte.setSolde(compte.getSolde()-montant);
		compteRepository.save(compte);
	}

	@Override
	public void virement(String codeCpte1, String codeCpte2, double montant) {
		// TODO Auto-generated method stub
		if(codeCpte1.equals(codeCpte2))
			throw new RuntimeException("Operation Impossible sur le meme compte");
		retirer(codeCpte1,montant);
		verser(codeCpte2,montant);
		
	}

	
	

	@Override
	public Compte getCompteByNumeroCompte(String numeroCompteN) {
		// TODO Auto-generated method stub
		l.info("compte", new Compte() );
		return compteRepository.getCompteByNumeroCompte(numeroCompteN);
	}


/*
	@Override
	public Compte UpdatCompte(String codeCpte1, String Adresse, int tel) {
		// TODO Auto-generated method stub
		Compte e =compteRepository.findById(codeCpte1).get() ;
		e.setTel(tel);
		e.setAdresse(Adresse);
		return compteRepository.save(e);
		
	}*/


	@Override
	public void mettreAjouAdresseByCompteJPQL(String codeCpte1, String Adressec) {
		// TODO Auto-generated method stub
		compteRepository.mettreAjouAdresseByCompteJPQL(codeCpte1, Adressec);
	}
	@Override
	public Compte addCompte(Compte c, Long idAgence, Long code_client) {
		// TODO Auto-generated method stub
		Agence a = agenceRepository.findById(idAgence).get();
		Client client = clientRepository.findById(code_client).get();
		c.setAgence(a);
		c.setClient(client);
		c.setDate_ouverture(new Date());
		return compteRepository.save(c);
	}


	@Override
	public Operation addOperation(Operation op, String codeCpte, Long code_client, Long idAgence) {
		// TODO Auto-generated method stub
		Compte cp = consulterCompte(codeCpte);
		
		cp=addCompte(cp, idAgence, code_client);
		  op.setCompte(cp);
			
			op.setDateOperation(new Date());
			
			return operationrepository.save(op);
		
		
	}



	


	/*@Override
	public Page<Operation> ListOperations(String codeCpte, Pageable pos, int nbOp) {
		// TODO Auto-generated method stub
	
		post =new  new PageRequest(page,size)
		return (Page<Operation>)operationrepository.ListOperations(codeCpte, pos);
	}
*/

/*
	@Override
	public Page<Operation> consulterOperations(String codeCpte, Pageable pos, int nbOp) {
		// TODO Auto-generated method stub
		Compte cp = consulterCompte(codeCpte);
		List<Operation> p= cp.getOperations();
		
		
		return  (Page<Operation>)operationrepository.consulterOperations(codeCpte, pos, nbOp);
	}*/



}

	




