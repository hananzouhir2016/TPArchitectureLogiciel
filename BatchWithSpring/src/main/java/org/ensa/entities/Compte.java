package org.ensa.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Compte implements Serializable{
	@Id
	private int idCompte;
	private int Solde;
	
	@OneToMany( mappedBy = "compte" )
	private List<Transactione> listeI;
	public int getIdCompte() {
		return idCompte;
	}
	public List<Transactione> getListeI() {
		return listeI;
	}
	public void setListeI(List<Transactione> listeI) {
		this.listeI = listeI;
	}
	public Compte() {
		super();
	}
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	public int getSolde() {
		return Solde;
	}
	public void setSolde(int solde) {
		Solde = solde;
	}
}
