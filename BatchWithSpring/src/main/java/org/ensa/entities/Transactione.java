package org.ensa.entities;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Transactione implements Serializable{
	@Id
	private int idTransaction;
	private int Montant;
	@ManyToOne
	@JoinColumn( name = "IdCompte" )
	private Compte compte;
	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public int getIdTransaction() {
		return idTransaction;
	}

	public void setIdTransaction(int idTransaction) {
		this.idTransaction = idTransaction;
	}

	public double getMontant() {
		return Montant;
	}

	public void setMontant(int montant) {
		Montant = montant;
	}

	public Transactione(int idTransaction, int montant) {
		super();
		this.idTransaction = idTransaction;
		this.Montant = montant;
	}

	public Transactione() {
		
	}

}
