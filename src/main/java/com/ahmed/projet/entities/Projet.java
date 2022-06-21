//Notre entité Projet
package com.ahmed.projet.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;



/////////////////////////////////////////////////////
/*Lombok qui gére les getters et les setters automatiquement*/
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
 @NoArgsConstructor
 @AllArgsConstructor

////////////////////////////////////////////////////

@Entity
@Table(name = "projet")
public class Projet {
	//cle primere
	@Id
	//auto incrementation
	@GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idProjet;

    private String nomProjet;
    
    private String chefProjet;
    
    private String descProjet;
    
    private Double budgetProjet;
    
    private String statut;
    

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateDebut;
    

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateEcheance;
    
    
    private String pole;

    
    //
	@JsonIgnore
	@OneToMany (mappedBy = "projet")
	private List<Tache> taches;

	
	

}
