package com.ahmed.projet.service;

import java.util.List;

import com.ahmed.projet.entities.Role;



public interface RoleService {

	/*Role saveUser(Role u); */
	List<Role> getAllRoles();
	
	Role getRole(Long id);
}

