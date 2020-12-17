package com.users.models;

public class User extends Person{

	private String login;
	private String password;
	private String service;
	
	
	public User(int matricule, String nom, String prenom, String email, int telephone, double salaire, String login, String password, String service) {
		super(matricule, nom, prenom, email, telephone, salaire);
		this.login = login;
		this.password = password;
		this.service = service;
	}

	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getService() {
		return service;
	}
	
	public void setService(String service) {
		this.service = service;
	}

	public void calculerSalaire(double salaire, String service) {
		
		switch(service)
		{
		case "DG" :  
			this.setSalaire(this.getSalaire() + (this.getSalaire() * 15/100));
			break;
			
		case "MN" :  
			this.setSalaire(this.getSalaire() + (this.getSalaire() * 8/100));
			break;
			
		default : 
			this.setSalaire(salaire);
			break;
		}
		
	}
	

	@Override
	public String toString() {
		return "L'utilisateur : "+ super.toString() + ", login=" + login + ", password=" + password + ", service=" + service;
	}
	
}
