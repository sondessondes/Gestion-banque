package tn.grp3DL1.banque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tn.grp3DL1.banque.entities.Compte;
@Repository
public interface CompteRepository extends JpaRepository<Compte, String> {
	
	@Query("select compte from Compte compte where compte.numeroCompte =:numeroCompteN")
	public Compte getCompteByNumeroCompte( @Param("numeroCompteN") String numeroCompteN);
	/* @Query("select a from  Compte a where a.numeroCompte =codeCpte")
	public Compte findOne(@Param("codeCpte")String codeCpte);*/

	
	@Modifying
    @Transactional
    @Query("UPDATE Compte c SET c.Adresse=:Adressec  where c.numeroCompte=:codeCpte1")
	public void mettreAjouAdresseByCompteJPQL( @Param("codeCpte1") String codeCpte1, @Param("Adressec") String Adressec) ;
}
