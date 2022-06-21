package com.ahmed.projet.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.ahmed.projet.entities.Projet;


public interface ProjetService {
	
	Projet saveProjet(Projet c);
	Projet updateProjet(Projet c);
	void deleteProjet(Projet c);
	void deleteProjetById(Long id);
	Projet getProjet(Long id);
	List<Projet> getAllProjets();
	
	Page<Projet> getAllProjetsParPage(int page, int size);


	
	//List<Projet> findByTitreLivre(String titre);
	List<Projet> findByNomProjetContains(String nom);
	
	List<Projet> findByPole (String p);
	//List<Book> findByGenreIdGen(Long id);
	
	

	//List<Book> findByTitreLivrePrix (String titre, Double prix);

	//List<Book> findByOrderByTitreLivreAsc();
	//List<Book> trierBooksTitresPrix();
	//List<Book> findByAuteurLivreContains(String auteurLivre);

}
