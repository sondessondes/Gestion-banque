package tn.grp3DL1.banque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.grp3DL1.banque.entities.Client;
@Repository
public interface ClientRepository extends JpaRepository< Client, Long> {

}
