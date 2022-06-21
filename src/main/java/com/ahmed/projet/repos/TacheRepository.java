////faire toute les operation CRUD ( on implémentant l'interface JpaRepository) sur notre entité Tache à travers
package com.ahmed.projet.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ahmed.projet.entities.Projet;
import com.ahmed.projet.entities.Tache;

@RepositoryRestResource(path = "tach")
//@CrossOrigin("http://localhost:4200") //autoriser Angular
@CrossOrigin("*") //autoriser Angular
public interface TacheRepository extends JpaRepository<Tache, Long> {
	
	@Query("select l from Tache l where l.projet = ?1")
	List<Tache> findByProjet(Projet projet);
	
	
	
	List<Tache> findByProjetIdProjet(Long id);
}
