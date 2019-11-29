
public class Personne {
	private String prenom;
	private String nom;
	private int age;
	
	public Personne(String _prenom, String _nom, int _age) {
		this.prenom=_prenom;
		this.nom=_nom;
		this.age=_age;
	}
	
	public void affiche() {
		System.out.println("La personne s'appelle "+prenom+" "+nom+" et a "+age+" ans.");
	}
	
	public static void main(String[] args) {
		Personne p1=new Personne("Valentin", "Durand", 27);
		p1.affiche();
		Personne p2=new Personne("Alphonse", "Brown", 47);
		p2.affiche();
	}
}
