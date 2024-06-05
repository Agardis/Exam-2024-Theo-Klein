package poo_exam;

public class Enseignant extends Individu{
	private String specialisation;
	private double salaireMensuel;
	
	public Enseignant(String nom, String prenom, int identifiant, String specialisation, double salaireMensuel) {
		super(nom, prenom, identifiant);
		
		this.specialisation = specialisation;
		this.salaireMensuel = salaireMensuel;
	}
	
	public String setSpecialisation()
	{
		return this.specialisation;
	}
	
	public double setSalaireMensuel()
	{
		return this.salaireMensuel;
	}
	
	public void setSpecialisation(String specialisation)
	{
		this.specialisation = specialisation;
	}
	
	public void setSalaireMensuel(double salaireMensuel)
	{
		this.salaireMensuel = salaireMensuel;
	}

	@Override
	public void montrerDetails() {
		System.out.println(
				"Enseignant n°" 		+ this.getIdentifiant() + ":\n"
				+ "Nom: " 				+ this.getNom() 		+ "\n"
				+ "Prénom: " 			+ this.getPrenom() 		+ "\n"
				+ "Spécialisation: " 	+ this.specialisation 	+ "\n"
				+ "Salaire mensuel: " 	+ this.salaireMensuel 	+ "€\n");	
	}

}
