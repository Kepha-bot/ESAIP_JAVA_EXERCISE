
public class Matrice {
	private Vecteur matrice[];
	
	public Matrice() {
		Vecteur matrice[]=new Vecteur[3];
	}
	
	public Matrice(Vecteur v1, Vecteur v2, Vecteur v3) {
		Vecteur matrice[]=new Vecteur[3];
		matrice[0]=v1;
		matrice[1]=v2;
		matrice[2]=v3;
	}
	
	public Matrice(Matrice m) {
		this.matrice[0]=m.matrice[0];
		this.matrice[1]=m.matrice[1];
		this.matrice[2]=m.matrice[2];
	}
	
	public Vecteur getV1() {
		return this.matrice[0];
	}
	
	public Vecteur getV2() {
		return this.matrice[1];
	}
	
	public Vecteur getV3() {
		return this.matrice[2];
	}
	
	public Matrice sommeM(Matrice m) {
		Matrice n = new Matrice(
				this.matrice[0].somme(m.matrice[0]),
				this.matrice[1].somme(m.matrice[1]),
				this.matrice[2].somme(m.matrice[2])
				);
		return n;
	}
	
	public void afficher() {
		System.out.println("Valeurs de la matrice");
		Vecteur tmp1 = this.getV1();
		tmp1.afficher();
		Vecteur tmp2 = this.getV2();
		tmp1.afficher();
		Vecteur tmp3 = this.getV3();
		tmp1.afficher();
	}
	
	public static void main(String[] args) {
		Vecteur v1=new Vecteur(1, 2, 3);
		Vecteur v2=v1.produitS(3);
		Vecteur v3=v1.produitV(v2);
		
		v1.afficher();
		v2.afficher();
		v3.afficher();
		
		Matrice m=new Matrice(v1, v2, v3);
		m.afficher();
	}
}
