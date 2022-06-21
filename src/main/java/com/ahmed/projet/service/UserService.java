package com.ahmed.projet.service;

import java.util.List;

import com.ahmed.projet.entities.Role;
import com.ahmed.projet.entities.User;


public interface UserService {
	

	User saveUser(User u); 
	void deleteUserById(Long id); 
	List<User> getAllUsers();
	List<User> getAllUsersByRoleNomRole(String nom);
	User getUser(Long id);
	User updateUser(User u);
	
	User findUserByUsername(String username);
	User findUserByEmail(String email);
	
	
	Role addRole(Role role);
	User addRoleToUser(String email, String rolename);
	
}
