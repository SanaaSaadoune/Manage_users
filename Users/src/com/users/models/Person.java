package com.users.models;

public class Person {

	private int matricule;
	private String nom;
	private String prenom;
	private String email;
	private int telephone;
	private double salaire;
	

	public Person(int matricule, String nom, String prenom, String email, int telephone, double salaire) {
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.salaire = salaire;
	}

	public int getMatricule() {
		return matricule;
	}
	
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getTelephone() {
		return telephone;
	}
	
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	
	public double getSalaire() {
		return salaire;
	}
	
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", telephone=" + telephone + ", salaire=" + salaire ;
	}
	
}
