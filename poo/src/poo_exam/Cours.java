package poo_exam;

public class Cours implements Participable{
	private String titre;
	private String formateur;
	private int duree;
	private int placesRestantes;
	
	public Cours(String titre, String formateur, int duree, int placesRestantes)
	{
		this.titre = titre;
		this.formateur = formateur;
		this.duree = duree;
		this.placesRestantes = placesRestantes;
	}
	
	public String GetTitre()
	{
		return this.titre;
	}
	
	public String GetFormateur()
	{
		return this.formateur;
	}
	
	public int GetDuree()
	{
		return this.duree;
	}
	
	public int GetPlacesRestantes()
	{
		return this.placesRestantes;
	}
	
	public void SetTitre(String titre)
	{
		this.titre = titre;
	}
	
	public void SetFormateur(String formateur)
	{
		this.formateur = formateur;
	}
	
	public void SetDuree(int duree)
	{
		this.duree = duree;
	}
	
	public void SetPlacesRestantes(int placesRestantes)
	{
		this.placesRestantes = placesRestantes;
	}
	
	public void montrerDetails()
	{
		System.out.println("Informations du cours: ");
		System.out.println("Titre: " 			+ this.titre 		+ "\n"
						+ "Formateur: " 		+ this.formateur 	+ "\n"
						+ "Durée: " 			+ this.duree 		+ "\n"
						+ "Places Restantes: " 	+ this.placesRestantes + "\n");
	}

	@Override
	public void participer() {
		this.placesRestantes -= 1;
	}

	@Override
	public void quitter() {
		this.placesRestantes += 1;
	}
}
