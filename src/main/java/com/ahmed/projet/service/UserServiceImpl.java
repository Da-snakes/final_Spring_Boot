package com.ahmed.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;*/
import org.springframework.stereotype.Service;
/*import org.springframework.transaction.annotation.Transactional;*/

import com.ahmed.projet.entities.Role;
import com.ahmed.projet.entities.User;
import com.ahmed.projet.repos.RoleRepository;
import com.ahmed.projet.repos.UserRepository;



//@Transactional
@Service
public class UserServiceImpl implements UserService{
	
	//odonné à sprint Injection une implementation des dependances 
		@Autowired
		
		//objet pour CRUD
		UserRepository userRepository;
		
		@Autowired
		RoleRepository roleRepository;
		/*@Autowired
		BCryptPasswordEncoder bCryptPasswordEncoder;*/
		
	@Override
	public User saveUser(User u) {
		//u.setPassword(bCryptPasswordEncoder.encode(u.getPassword()));
		/*u.setPassword(bCryptPasswordEncoder.encode(u.getPassword()));*/
		return userRepository.save(u);
	}
	
	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public User getUser(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public User updateUser(User u) {
		//u.setPassword(bCryptPasswordEncoder.encode(u.getPassword()));
		/*u.setPassword(bCryptPasswordEncoder.encode(u.getPassword()));*/
		return userRepository.save(u);
	}
	
	/////////////////////////////////////////////////////////

	@Override
	public User findUserByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}

	@Override
	public User findUserByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email);
	}

	@Override
	public Role addRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public User addRoleToUser(String email, String rolename) {
	User usr = userRepository.findByEmail(email);
	Role r = roleRepository.findByNomRole(rolename);
	usr.setRole(r);
	return userRepository.save(usr);
	}

	@Override
	public List<User> getAllUsersByRoleNomRole(String nom) {
		// TODO Auto-generated method stub
		return userRepository.findByRoleNomRole(nom);
	}


}
