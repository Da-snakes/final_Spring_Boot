////faire toute les operation CRUD ( on implémentant l'interface JpaRepository) sur notre entité User à travers
package com.ahmed.projet.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahmed.projet.entities.User;




//faire toute les operation à travers ça
public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername(String username);
	User findByEmail(String email);

	
	List<User> findByRoleNomRole(String nom);

}
