package tn.grp3DL1.banque;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.grp3DL1.banque.entities.Pack1;
<<<<<<< HEAD
=======
import tn.grp3DL1.banque.service.Pack1ServiceImpl;
>>>>>>> branch 'master' of https://github.com/sihemsouli/Gestion-banque.git



//@RunWith(SpringRunner.class)
@SpringBootTest
class GestionBanqueApplicationTests {

	private static final Logger L = LogManager.getLogger(GestionBanqueApplication.class);
	
<<<<<<< HEAD
	//@Autowired
	//PackServiceImpl ps1;
=======
	@Autowired
	Pack1ServiceImpl ps1;
>>>>>>> branch 'master' of https://github.com/sihemsouli/Gestion-banque.git
	
	//@Test
//public	void testAjouterPack() throws ParseException {
		//Pack1 p=new Pack1(123, 1234, 1235, true, true, 1);
		//ps1.ajouterPack1(p);
		//L.info("Pack1 ajouté : "+p.getId()+","+p.getCmpt_depot()+","+p.getCmpt_epargne()
		//+","+p.getCrt_liberte() +","+p.getCmpt_distance()+","+p.getAssurance() 
		//+","+p.getClient() );
	//}

}
