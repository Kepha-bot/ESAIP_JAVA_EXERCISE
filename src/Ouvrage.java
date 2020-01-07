import java.util.*;
public class Ouvrage {

	int cote;
	String titre;
	GregorianCalendar dateCreation;
	public static int nombreOuvrage=0;
	
	public Ouvrage(String titre) {
		this.dateCreation = new GregorianCalendar();
		nombreOuvrage++;
		this.cote = nombreOuvrage;
		this.titre = titre;
	}
	
	public void affiche() {
		int mois = dateCreation.get(Calendar.MONTH)+1;
		System.out.println("La c�te est : "+this.cote);
		System.out.println("Le nombre d'ouvrage est : "+nombreOuvrage);
		System.out.println("L'ann�e de cr�ation est : "+dateCreation.get(Calendar.YEAR));
		System.out.println("Le mois de cr�ation est : "+mois);
	}
}
