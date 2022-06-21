//Notre entité User
package com.ahmed.projet.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")

public class User {
	//primary key
	@Id
	//auto incrementation
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private long iduser;
	private String username;
	private String email;
	private String password;
	private Boolean enabled;
		/*@ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
		@JoinTable(
				name="user_role",joinColumns = @JoinColumn(name="user_id") ,
				inverseJoinColumns = @JoinColumn(name="role_id")
				)*/
	
	@ManyToOne
	private Role role;
	
	/*////////////////////////////////////////////////
	//Getter & setter de role
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	////////////////////////////////////////////////
	//Getters & setters User
	public long getIduser() {
		return iduser;
	}
	public void setIduser(long iduser) {
		this.iduser = iduser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	///////////////////////////////////////////////////////
	public User() {
		super();
	}*/
	
	///////////////////////////////////////////////////////
	//Rq Constructeur utilise Field n'existe pas pour iduser car auto increment
	public User(String username, String email, String password, Role role) {
	super();
	this.username = username;
	this.email = email;
	this.password = password;
	this.enabled = true;
	this.role = role;
	}
	
	///////////////////////////////////////////
	//toString
	/*@Override
	public String toString() {
		return "User [iduser=" + iduser +", username=" + username + 
				", email=" + email + ", password=" + password +
				", role=" + role + "]";
	}*/
	
	@Override
	public String toString() {
		return "User [iduser=" + iduser + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", enabled=" + enabled + ", role=" + role + "]";
	}
}