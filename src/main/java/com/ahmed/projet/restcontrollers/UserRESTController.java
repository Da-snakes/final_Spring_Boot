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
import com.ahmed.projet.entities.User;
import com.ahmed.projet.repos.UserRepository;
import com.ahmed.projet.service.UserService;



@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")

public class UserRESTController {
	
	@Autowired
	UserRepository userRep;
	
	@RequestMapping(value ="/login/{username}", method = RequestMethod.GET)
	public User getUserByUsername(@PathVariable("username") String username) {
		return userRep.findByUsername(username);
	}
	
	@RequestMapping(value ="/logino/{email}", method = RequestMethod.GET)
	public User getUserByEmail(@PathVariable("email") String email) {
		return userRep.findByEmail(email);
	}
	
//////////////////////////////////////Service	
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value ="/all", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return userService.getAllUsers();
		
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public User create(@RequestBody User u) {
		return userService.saveUser(u);
	}
	
	
	
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable("id") Long id)
	{
		userService.deleteUserById(id);
	}
	
	
	
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public User getUser(@PathVariable("id") Long id)
	{
		return userService.getUser(id);
	}
	/*@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public User getUserById(@PathVariable("id") Long id) {
	return userRep.findById(id).get();
	}*/
	
	@RequestMapping(value="/me/{email}",method = RequestMethod.GET)
	public User getUserByEmail1(@PathVariable("email") String email)
	{
		return userService.findUserByEmail(email);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public User updateUpdate(@RequestBody User user) {
	return userService.updateUser(user);
	}
	
	
	//getAllUsersByRoleNomRole(nom)
	
	@RequestMapping(value="/role/{p}",method = RequestMethod.GET)
	public List<User> getAllUsersByRole(@PathVariable("p") String p)
	{
		return userService.getAllUsersByRoleNomRole(p);
	}
	

}