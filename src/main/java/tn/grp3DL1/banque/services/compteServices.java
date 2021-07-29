package tn.grp3DL1.banque.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import tn.grp3DL1.banque.entities.Compte;
import tn.grp3DL1.banque.entities.Compte_courant;
import tn.grp3DL1.banque.entities.Compte_epargne;
import tn.grp3DL1.banque.entities.Operation;

public interface compteServices {
	

	    

	public Compte addCompte(Compte c,Long idAgence,Long code_client);
	
    
	public void mettreAjouAdresseByCompteJPQL(String codeCpte1, String Adressec) ;
	public Compte getCompteByNumeroCompte(String numeroCompteN);
	
	public Operation addOperation(Operation op, String codeCpte, Long code_client,Long idAgence) ;

	
	public Compte consulterCompte(String codeCpte);
	public void verser(String codeCpte,double montant);
	public void retirer(String codeCpte,double montant);
	public void virement(String codeCpte1,String codeCpte2,double montant);
	//public Page<Operation> ListOperations(String codeCpte, Pageable pos, int nbOp);
	//sspublic List<Operation> getAllOperationByCompte(String codeCpte);
	//public List<Operation> consulterOperations(String codeCompte);
}
