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
	
	public String GetNom()
	{
		return this.nom;
	}
	
	public String GetPrenom()
	{
		return this.prenom;
	}
	
	public int GetIdentifiant()
	{
		return this.identifiant;
	}
	
	public void SetNom(String nom)
	{
		this.nom = nom;
	}
	
	public void SetPrenom(String prenom)
	{
		this.prenom = prenom;
	}
	
	public void SetIdentifiant(int identifiant)
	{
		this.identifiant = identifiant;
	}
	
	public abstract void MontrerDetails();
}

