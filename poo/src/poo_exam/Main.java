package poo_exam;

import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		 ArrayList<Individu> individuList = new ArrayList<Individu>();
		 ArrayList<Cours> coursList = new ArrayList<Cours>();
		 
		 Date today = new Date();
		 
		 
		 individuList.add(new Etudiant("Klein", "Théo", 1, today, "BAC+3"));
		 individuList.add(new Etudiant("Hahn", "Elisa", 2, today, "BAC+4"));
		 individuList.add(new Etudiant("Rolland", "Tove", 3, today, "BAC+2"));
		 individuList.add(new Etudiant("Lecomte", "Marie", 4, today, "BAC+5"));
		 individuList.add(new Etudiant("Gambet", "Adrien", 5, today, "BAC+5"));
		 
		 individuList.add(new Enseignant("Dubois", "Henry", 6, "Mathématiques", 2500.50));
		 individuList.add(new Enseignant("Torval", "Linus", 7, "Informatique", 3010.65));
		 individuList.add(new Enseignant("Dickens", "Charles", 8, "Anglais", 1604.24));
		 individuList.add(new Enseignant("De La Fontaine", "Jean", 9, "Français", 4932.64));
		 individuList.add(new Enseignant("Bonaparte", "Napoléon", 10, "Histoire", 3804.10));
		 
		 coursList.add(new Cours("Mathématiques avancées", "Henry Dubois", 2, 10));
		 coursList.add(new Cours("Base de données", "Linus Torval", 3, 10));
		 coursList.add(new Cours("Anglais", "Charles Dickens", 1, 10));
		 coursList.add(new Cours("Français", "Jean De La Fontaine", 4, 10));
		 coursList.add(new Cours("Histoire du 18ème siècle", "Napoléon Bonaparte", 5, 10));
		 
		 
		 for (Individu individu : individuList) {
			 individu.montrerDetails();
			 if (individu instanceof Etudiant)
			 {
				 ((Etudiant) individu).participer(coursList.get(0));
				 ((Etudiant) individu).participer(coursList.get(1));
				 ((Etudiant) individu).participer(coursList.get(2));
				 ((Etudiant) individu).participer(coursList.get(3));
				 ((Etudiant) individu).participer(coursList.get(4));
				 individu.montrerDetails();
			 }
		 }
		 
		 for (Cours cours : coursList) {
			cours.montrerDetails();
		 }
		 
		 for (Individu individu : individuList) {
			if ((individu instanceof Etudiant) && individu.getIdentifiant() % 2 == 0)
			{
				((Etudiant) individu).quitter(coursList.get(0));
			}
		 }
		 
		 for (Cours cours : coursList) {
			 cours.montrerDetails();
		 }
		 
	}

}
