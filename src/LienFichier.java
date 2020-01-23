import java.io.*;

public class LienFichier {
	
	public LienFichier() {
		
		try {
			FileReader f1 = new FileReader("lecture.txt");
			int n;
			while((n=f1.read())!=1) {
				System.out.println(n);
			}
			f1.close();
		} catch(IOException e) {
			System.out.println("Erreur d'ouverture du fichier");
		}		
	}
	
	public static void main(String[] args) {
		LienFichier Fichier = new LienFichier();
	}
}
