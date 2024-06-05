package poo_exam;

import java.util.Date;

public class Etudiant extends Individu{
	private Date dateInscription;
	private String niveauEtude;
	
	public Etudiant(String nom, String prenom, int identifiant, Date dateInscription, String niveauEtude) {
		super(nom, prenom, identifiant);
		this.dateInscription = dateInscription;
		this.niveauEtude = niveauEtude;
	}
	
	public Date GetDateInscription()
	{
		return this.dateInscription;
	}
	
	public String GetNiveauEtude()
	{
		return this.niveauEtude;
	}
	
	@Override
	public void MontrerDetails() {
		// TODO Auto-generated method stub
		
	}

}
