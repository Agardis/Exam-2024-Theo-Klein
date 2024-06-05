package poo_exam;

import java.util.ArrayList;
import java.util.Date;

public class Etudiant extends Individu{
	private Date dateInscription;
	private String niveauEtude;
	private ArrayList<Cours> cours;
	
	public Etudiant(String nom, String prenom, int identifiant, Date dateInscription, String niveauEtude) {
		super(nom, prenom, identifiant);
		this.dateInscription = dateInscription;
		this.niveauEtude = niveauEtude;
		this.cours = new ArrayList<Cours>();
	}
	
	public Date getDateInscription()
	{
		return this.dateInscription;
	}
	
	public String getNiveauEtude()
	{
		return this.niveauEtude;
	}
	
	public void setDateInscription(Date dateInscription)
	{
		this.dateInscription = dateInscription;
	}
	
	public void setNiveauEtude(String niveauEtude)
	{
		this.niveauEtude = niveauEtude;
	}
	
	public void participer(Cours cours)
	{
		this.cours.add(cours);
		cours.participer();
	}
	
	public void quitter(Cours cours)
	{
		this.cours.remove(cours);
		cours.quitter();
	}
	
	@Override
	public void montrerDetails() {
		System.out.println(
				"Elève n°" 					+ this.getIdentifiant() 			+ "\n"
				+ "Nom: " 					+ this.getNom() 					+ "\n"
				+ "Prénom: " 				+ this.getPrenom() 					+ "\n"
				+ "Date d'inscription: " 	+ this.dateInscription.toString() 	+ "\n"
				+ "Niveau d'étude: " 		+ this.niveauEtude 					+ "\n"
				+ "Cours: ");
		for (Cours cours : this.cours) {
			System.out.println(cours.GetTitre() + ", ");
		}
		System.out.println();
	}

}
