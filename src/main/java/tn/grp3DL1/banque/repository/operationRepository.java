package tn.grp3DL1.banque.repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.grp3DL1.banque.entities.Operation;
@Repository
public interface operationRepository extends JpaRepository<Operation, Long> {
	//@Query(value ="Select operation from Operaton operation join operation.compte compt where compt.numeroCompte=:numero_comptec")
    
	//public Operation getOperationByCompte(@Param("numero_comptec") String numero_comptec);
/*	@Query(value="select o from Operation o where o.compte.numeroCompte=:codeCpte and order by o.dateOperation desc ")
	public Page<Operation> ListOperations(@Param("codeCpte")String codeCpte,@Param("pos")Pageable  pos);*/
}
