import java.util.*;

public class Garage2 {
	
	private String nom;
	private LinkedList<Voiture> l;
	
	public Garage2(String nom) {
		this.nom = nom;
		l = new LinkedList<Voiture>();
	}
	
	public void ajourtVoiture(Voiture v) {
		l.addLast(v);
	}
	
	public void affiche() {
		System.out.println("Nom garage = "+this.nom);
		for(int i=0; i<l.size(); i++) {
			Voiture v = l.get(i);
			v.affiche();
		}
	}
	
	public int rechercher(Voiture v) {
		int indice = -1;
		boolean trouve = false;
		
		for (int i=0; i<l.size(); i++) {
			if(trouve==false) {
				Voiture vl = l.get(i);
				if ((vl.getNomConstructeur().equals(v.getNomConstructeur()))&&(vl.getModel().equals(v.getModel()))) {
					indice = i;
					trouve = true;
				}
			}
		}
		
		return indice;
	}
	
	public void supprimer(Voiture v) {
		if(rechercher(v)!=-1) {
			l.remove(rechercher(v));
		}
	}
}
