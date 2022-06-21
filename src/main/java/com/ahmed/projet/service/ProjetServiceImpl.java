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
public class ProjetServiceImpl implements ProjetService{
	
	
	
	//odonné à sprint Injection une implementation des dependances 
		@Autowired
		
		//objet pour CRUD
		ProjetRepository projetRepository;
		
		@Autowired
		TacheRepository tacheRepository;

	@Override
	public Projet saveProjet(Projet c) {
		return projetRepository.save(c);
	}

	@Override
	public Projet updateProjet(Projet c) {
		return projetRepository.save(c);
	}

	@Override
	public void deleteProjet(Projet c) {
		
		/*for (Tache t: c.getTaches()) {
		    System.out.println(t);
			tacheRepository.deleteById(t.getIdTache());
		}

		c.setTaches(null);
		projetRepository.save(c);*/
		projetRepository.delete(c);
		
	}

	@Override
	public void deleteProjetById(Long id) {

		
		/*Projet p = projetRepository.findById(id).get();
		
		System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+p);*/
		/*for (Tache t: p.getTaches()) {
		    System.out.println(t);
			tacheRepository.deleteById(t.getIdTache());
		}*/
		
		/*p.setTaches(null);
		projetRepository.save(p);*/
		projetRepository.deleteById(id);
		
	}

	@Override
	public Projet getProjet(Long id) {
		return projetRepository.findById(id).get();
	}

	@Override
	public List<Projet> getAllProjets() {
		return projetRepository.findAll();
	}

	@Override
	public Page<Projet> getAllProjetsParPage(int page, int size) {
		return projetRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<Projet> findByNomProjetContains(String nom) {
		return projetRepository.findByNomProjetContains(nom);
	}

	@Override
	public List<Projet> findByPole(String p) {
		return projetRepository.findByPole(p);
	}

}
