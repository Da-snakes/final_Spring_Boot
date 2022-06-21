//Notre entité User Role
package com.ahmed.projet.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "role")
public class Role {
	//cle primere
	@Id
	//auto incrementation
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idRole;
	private String nomRole;
	
	//
	@OneToMany (mappedBy = "role")
	@JsonIgnore
	private List<User> users;

	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", nomRole=" + nomRole + "]";
	}
	


}

