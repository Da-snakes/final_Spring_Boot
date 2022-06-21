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
import com.ahmed.projet.service.ProjetService;
import com.ahmed.projet.service.TacheService;



@RestController
@RequestMapping("/apip")
@CrossOrigin
public class ProjetRESTcontrollers {
	
	@Autowired
	ProjetService projetService;
	
	@Autowired
	TacheService tacheService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Projet> getAllProjets()
	{
		return projetService.getAllProjets();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Projet getProjetById(@PathVariable("id") Long id) {
		return projetService.getProjet(id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public Projet createProjet(@RequestBody Projet projet) {
	return projetService.saveProjet(projet);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Projet updateProjet(@RequestBody Projet projet) {
	return projetService.updateProjet(projet);
	}
	
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteProjet(@PathVariable("id") Long id)
	{
		projetService.deleteProjetById(id);
	}
	
	

	@RequestMapping(value="/pole/{p}",method = RequestMethod.GET)
	public List<Projet> getAllProjetsByPole(@PathVariable("p") String p)
	{
		return projetService.findByPole(p);
	}
	

}
