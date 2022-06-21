package com.ahmed.projet.service;

import java.util.List;

import org.springframework.data.domain.Page;


import com.ahmed.projet.entities.Projet;
import com.ahmed.projet.entities.Tache;

public interface TacheService {
	
	
	Tache saveTache(Tache l);
	Tache updateTache(Tache l);
	void deleteTache(Tache l);
	void deleteTacheById(Long id);
	Tache getTache(Long id);
	List<Tache> getAllTaches();


	Page<Tache> getAllTachesParPage(int page, int size);
	
	//List<Tache> findByNomTache(String titre);
	/*List<Tache> findByNomTacheContains(String titre);*/
	
	List<Tache> findByProjet (Projet projet);
	List<Tache> findByProjetIdProjet(Long id);
	
	
	//List<Tache> findByTitreLivrePrix (String titre, Double prix);

	//List<Tache> findByOrderByTitreLivreAsc();
	//List<Tache> trierBooksTitresPrix();
	//List<Tache> findByAuteurLivreContains(String auteurLivre);

}
