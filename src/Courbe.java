import java.util.LinkedList;

public class Courbe {
	private String nom;
	private LinkedList<Point> liste;
	
	public Courbe (String _nom, Point p1, Point p2, Point p3) {
		this.nom=_nom;
		this.liste = new LinkedList<Point>();
		this.liste.add(p1);
		this.liste.add(p2);
		this.liste.add(p3);
	}
	
	public void afficher() {
		String newLine = System.getProperty("line.separator");
		System.out.println("Nom de la liste : "+this.nom+newLine);
		for (int i=0; i<this.liste.size(); i++) {
			Point p = this.liste.get(i);
			int position = i+1;
			System.out.println("Point "+position+" : "); 
			p.affiche();	
		}
	}
	
	public void ajouter(Point p) {
		this.liste.addLast(p);
	}
	
	public int rechercher(Point p) {
		int position = -1;
		for(int i=0; i<this.liste.size(); i++) {
			if(this.liste.get(i)==p) {
				position = i;
				return position;
			}
		}
		return position;
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(1, 1);
		Point p2 = new Point(2, 2);
		Point p3 = new Point(3, 3);
		Point p4 = new Point(5, 5);
		Point p5 = new Point(6, 6);
		Courbe c1 = new Courbe("Courbe test", p1, p2, p3);
		
		c1.afficher();
		c1.ajouter(p4);
		c1.afficher();
		int pos1 = c1.rechercher(p3);
		System.out.println("Résultat de la recherche 1 : "+pos1);
		int pos2 = c1.rechercher(p5);
		System.out.println("Résultat de la recherche 2 : "+pos2);
	}
}
