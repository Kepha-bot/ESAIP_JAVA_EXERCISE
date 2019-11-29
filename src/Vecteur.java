
public class Vecteur {
	private double x;
	private double y;
	private double z;
	
	public Vecteur() {
		
	}
	
	public Vecteur(double _x, double _y, double _z) {
		this.x=_x;
		this.y=_y;
		this.z=_z;
	}
	
	public Vecteur(Vecteur v) {
		this.x=v.x;
		this.y=v.y;
		this.z=v.z;
	}
	
	public Vecteur somme(Vecteur v) {
		Vecteur n = new Vecteur();
		n.x=this.x+v.x;
		n.y=this.y+v.y;
		n.z=this.z+v.z;
		return n;
	}
	
	public Vecteur produitS(int s) {
		Vecteur n = new Vecteur();
		n.x=this.x*s;
		n.y=this.y*s;
		n.z=this.z*s;
		return n;
	}
	
	public Vecteur produitV(Vecteur v) {
		Vecteur n = new Vecteur();
		n.x=this.x*v.x;
		n.y=this.y*v.y;
		n.z=this.z*v.z;
		return n;
	}
	
	public void afficher() {
		System.out.println("X = "+this.x+", Y = "+this.y+", Z ="+this.z);
	}
	
	public static void main(String[] args) {
		Vecteur v1 = new Vecteur(1, 2, 3);
		v1.afficher();
	}
}
