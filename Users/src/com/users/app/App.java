package com.users.app;

import java.util.ArrayList;

import com.users.models.Profil;
import com.users.models.User;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<User> listUsers = new ArrayList<User>();
		ArrayList<Double> listSalaires = new ArrayList<Double>();

		Profil DG = new Profil(12344,"DG");
		Profil MN = new Profil(12344,"MN");
		Profil DP = new Profil(12344,"DP");

		User directeurG = new User(23356,"NOM","PRENOM","email@gmail.com",061234567,15900.6,"Directeur General","d123456",DG.getLibelle());
		listSalaires.add(directeurG.getSalaire());
		directeurG.calculerSalaire(directeurG.getSalaire(), directeurG.getService());
		
		User manager = new User(23356,"NOM","PRENOM","email@gmail.com",061234567,18300.6,"Manager","d123456",MN.getLibelle());
		listSalaires.add(manager.getSalaire());
		manager.calculerSalaire(manager.getSalaire(), manager.getService());
		
		User directeurP = new User(23356,"NOM","PRENOM","email@gmail.com",061234567,124300.6,"Directeur Projet","d123456",DP.getLibelle());
		listSalaires.add(directeurP.getSalaire());
		directeurP.calculerSalaire(directeurP.getSalaire(), directeurP.getService());
		
		listUsers.add(directeurG);
		listUsers.add(manager);
		listUsers.add(directeurP);
		
		System.out.println("------------------ Liste des utilisateurs : ------------------ \n");
		for(int i=0; i<listUsers.size(); i++)
		{
			System.out.println(listUsers.get(i).toString() +", salaire de base : " + listSalaires.get(i) + "\n" );
		}
		
		System.out.println("------------------ Liste des managers : ------------------ \n");
		for(int i=0; i<listUsers.size(); i++)
		{
			if(listUsers.get(i).getService().equals("MN"))
			{
				System.out.println(listUsers.get(i).toString());
			}
		}
	}

}
