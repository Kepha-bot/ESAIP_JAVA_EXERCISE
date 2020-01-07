
class PointCouleur extends Point {

	int couleur;
	
	public PointCouleur(int x, int y, int couleur) {
		super(x, y);
		this.couleur = couleur;
	}
	
	public void affiche() {
		super.affiche();
		System.out.println("La couleur est = "+this.couleur);
	}
	
}
