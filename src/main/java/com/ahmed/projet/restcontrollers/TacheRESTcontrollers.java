package com.ahmed.projet.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ahmed.projet.entities.Projet;
import com.ahmed.projet.entities.Tache;
import com.ahmed.projet.service.ProjetService;
import com.ahmed.projet.service.TacheService;

@RestController
@RequestMapping("/apit")
@CrossOrigin
public class TacheRESTcontrollers {
	
	
	@Autowired
	ProjetService projetService;
	
	@Autowired
	TacheService tacheService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Tache> getAllTaches()
	{
		return tacheService.getAllTaches();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Tache getTacheById(@PathVariable("id") Long id) {
		return tacheService.getTache(id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public Tache createTache(@RequestBody Tache tache) {
	return tacheService.saveTache(tache);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Tache updateTache(@RequestBody Tache tache) {
	return tacheService.updateTache(tache);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteTache(@PathVariable("id") Long id)
	{
		tacheService.deleteTacheById(id);
	}
	
	
	
	@RequestMapping(value="/projet/{id}",method = RequestMethod.GET)
	public List<Tache> getAllProjetsByProjet(@PathVariable("id") Long id)
	{
		return tacheService.findByProjetIdProjet(id);
	}

}
