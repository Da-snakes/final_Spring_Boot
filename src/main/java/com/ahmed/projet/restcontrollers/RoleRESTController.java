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
import com.ahmed.projet.entities.Role;
import com.ahmed.projet.repos.RoleRepository;
import com.ahmed.projet.service.RoleService;



@RestController
@RequestMapping("/role")
@CrossOrigin

public class RoleRESTController {
	
	@Autowired
	RoleService roleService;
	
	@Autowired
	RoleRepository roleRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Role> getAllRoles()
	{
		return roleService.getAllRoles();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Role getRole(@PathVariable("id") Long id)
	{
		return roleService.getRole(id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public Role createRole(@RequestBody Role c) {
		return roleRepository.save(c);
	}
	
	
	
}
