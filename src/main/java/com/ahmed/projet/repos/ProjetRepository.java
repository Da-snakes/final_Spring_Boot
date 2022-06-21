////faire toute les operation CRUD ( on implémentant l'interface JpaRepository) sur notre entité Projet à travers
package com.ahmed.projet.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ahmed.projet.entities.Projet;


@RepositoryRestResource(path = "proj")
//@CrossOrigin("http://localhost:4200") //autoriser Angular
@CrossOrigin("*") //autoriser tous(Angular)
public interface ProjetRepository extends JpaRepository<Projet, Long> {
	
	List<Projet> findByNomProjet(String nom);

	List<Projet> findByNomProjetContains(String nom);
	List<Projet> findByChefProjetContains(String chef);

	List<Projet> findByPole(String p);
	

}
