package tn.grp3DL1.banque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.grp3DL1.banque.entities.Compte;
import tn.grp3DL1.banque.entities.Compte_courant;
import tn.grp3DL1.banque.entities.Compte_epargne;
import tn.grp3DL1.banque.entities.Operation;
import tn.grp3DL1.banque.services.compteServices;

@RestController
public class RestControlCompte {
	
	@Autowired 
	compteServices compteservices;

	
	@PutMapping(value="/verser/{code}/{montant}")
	public void verser(@PathVariable("code")String codeCpte, @PathVariable("montant")double montant) {
		compteservices.verser(codeCpte, montant);
	}
	
	
	
	  @GetMapping("/getCompteByNumeroCompte/{numeroCompteN}")
	public Compte getCompteByNumeroCompte( @PathVariable String numeroCompteN) {
		return compteservices.getCompteByNumeroCompte(numeroCompteN);
	}
	
	
	  @GetMapping("/consulterCompte/{codeCpte}")
	public Compte consulterCompte(@PathVariable ("codeCpte")String codeCpte) {
		return compteservices.consulterCompte(codeCpte);
	}
	  

		@PutMapping("/retirer/{codeCpte}/{montant}")
	public void retirer(@PathVariable("codeCpte") String codeCpte,@PathVariable("montant") double montant) {
		compteservices.retirer(codeCpte, montant);
	}
		@PutMapping("/virement/{codeCpte1}/{codeCpte2}/{montant}")
	public void virement( @PathVariable ("codeCpte1")String codeCpte1,@PathVariable("codeCpte2") String codeCpte2,@PathVariable("montant") double montant) {
		compteservices.virement(codeCpte1, codeCpte2, montant);
	}
		 @GetMapping("/getAllOperationByCompte/{ codeCpte}")

		

		/* @PutMapping("/UpdatCompte/{codeCpte1}/{Adresse}")
		public void UpdatCompte(@PathVariable("codeCpte1") String codeCpte1,@PathVariable("Adresse") String Adresse) {
			compteservices.UpdatCompte(codeCpte1, Adresse);
		}
		 */

		@PostMapping("/addCompte/{idAgence}/{code_client}")
		public Compte addCompte(@RequestBody Compte c,@PathVariable("idAgence") Long idAgence,@PathVariable("code_client") Long code_client){
			return compteservices.addCompte(c, idAgence, code_client);
		}

		 @PutMapping("/mettreAjouAdresseByCompteJPQL/{codeCpte1}/{Adresse}")
		public void mettreAjouAdresseByCompteJPQL(@PathVariable("codeCpte1") String codeCpte1,@PathVariable("Adresse") String Adressec) {
			 compteservices.mettreAjouAdresseByCompteJPQL(codeCpte1, Adressec);
		}



		@PostMapping(value= "/addOperation/{idA}/{idC}/{ida}")
		public Operation addOperation(@RequestBody Operation op, @PathVariable("idA")String codeCpte,@PathVariable("idC") Long code_client,@PathVariable("ida") Long idAgence) {
			return compteservices.addOperation(op, codeCpte, code_client, idAgence);
		}


		/* @GetMapping("/ListOperations/{codeCpte}/{pos}/{nbOp}")
		public Page<Operation> ListOperations(@PathVariable("codeCpte")String codeCpte,@PathVariable("pos") Pageable pos, @PathVariable("nbOp")int nbOp) {
			return compteservices.ListOperations(codeCpte, pos, nbOp);
		}
*/

		
	  
		 
}
