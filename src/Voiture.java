
public class Voiture {

	private String nomConstructeur;
	private String model;
	private float prix;
	private int annee;	
	
	public String getNomConstructeur() {
		return nomConstructeur;
	}

	public void setNomConstructeur(String nomConstructeur) {
		this.nomConstructeur = nomConstructeur;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	public Voiture(String nomConstructeur, String model, float prix, int annee) {
		this.nomConstructeur = nomConstructeur;
		this.model = model;
		this.prix = prix;
		this.annee = annee;
	}
	
	public void affiche() {
		System.out.println("Nom du constructeur = "+this.nomConstructeur);
		System.out.println("Nom du modele = "+this.model);
		System.out.println("Valeur du prix = "+this.prix);
		System.out.println("Date de mise en circulation = "+this.annee);
	}
}
