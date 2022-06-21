////faire toute les operation CRUD ( on implémentant l'interface JpaRepository) sur notre entité Role à travers
package com.ahmed.projet.repos;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ahmed.projet.entities.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {
	
	
	Role findByNomRole(String nomRole);

}
