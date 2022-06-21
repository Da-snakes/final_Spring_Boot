package com.ahmed.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmed.projet.entities.Role;
import com.ahmed.projet.repos.RoleRepository;





@Service
public class RoleServiceImpl implements RoleService{
	
		//odonné à sprint Injection une implementation des dependances 
		@Autowired
			
			//objet pour CRUD
			RoleRepository roleRepository;
			//UserRepository userRepository;
			
		/*@Override
		public Role saveRole(Role r) {
			return roleRepository.save(r);
		}*/
		
		@Override
		public List<Role> getAllRoles() {
			return roleRepository.findAll();
		}
		
		@Override
		public Role getRole(Long id) {
			return roleRepository.findById(id).get();
		};

}