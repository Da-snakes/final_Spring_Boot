package com.ahmed.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ahmed.projet.entities.Projet;
import com.ahmed.projet.entities.Tache;
import com.ahmed.projet.repos.ProjetRepository;
import com.ahmed.projet.repos.TacheRepository;

@Service
public class TacheServiceImpl implements TacheService{
	//odonné à sprint Injection une implementation des dependances 
		@Autowired
		
		//objet pour CRUD
		ProjetRepository projetRepository;
		
		
		@Autowired
		TacheRepository tacheRepository;

	@Override
	public Tache saveTache(Tache l) {
		return tacheRepository.save(l);
	}

	@Override
	public Tache updateTache(Tache l) {
		return tacheRepository.save(l);
	}

	@Override
	public void deleteTache(Tache l) {
		tacheRepository.delete(l);
		
	}

	@Override
	public void deleteTacheById(Long id) {
		tacheRepository.deleteById(id);
		
	}

	@Override
	public Tache getTache(Long id) {
		return tacheRepository.findById(id).get();
	}

	@Override
	public List<Tache> getAllTaches() {
		return tacheRepository.findAll();
	}

	@Override
	public Page<Tache> getAllTachesParPage(int page, int size) {
		return tacheRepository.findAll(PageRequest.of(page, size));
	}

	/*@Override
	public List<Tache> findByNomTacheContains(String nom) {
		return tacheRepository.findByNomTacheContains(nom);
	}*/

	@Override
	public List<Tache> findByProjet(Projet projet) {
		return tacheRepository.findByProjet(projet);
	}

	@Override
	public List<Tache> findByProjetIdProjet(Long id) {
		return tacheRepository.findByProjetIdProjet(id);
	}
}
