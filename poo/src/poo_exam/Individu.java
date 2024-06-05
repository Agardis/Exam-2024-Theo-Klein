package poo_exam;

public abstract class Individu {
	private String nom;
	private String prenom;
	private int identifiant;
	
	public Individu(String nom, String prenom, int identifiant)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.identifiant = identifiant;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public String getPrenom()
	{
		return this.prenom;
	}
	
	public int getIdentifiant()
	{
		return this.identifiant;
	}
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}
	
	public void setIdentifiant(int identifiant)
	{
		this.identifiant = identifiant;
	}
	
	public abstract void montrerDetails();
}

