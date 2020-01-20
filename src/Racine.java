import java.util.*;

public class Racine {
	private double precision;
	
	public Racine(double precision) {
		this.precision=precision;
	}
	
	public double calcul(double operande) throws ExceptionRacine{
		double a, b, solution, carre;
		if(operande<=0) {
			throw new ExceptionRacine();
		} else {
			a=0;
			b=operande;
			solution=(a+b)/2;
			while(b-a>precision) {
				carre=solution*solution;
				carre = solution*solution;
				if (carre > operande)  b = solution;
				else a = solution;
				solution = (a+b)/2;
			}
			return solution;
		}
	}
}


class ExceptionRacine extends Exception{
	public ExceptionRacine() {
		System.out.println("La valeur de l'opérande est négative, renseignez une opérande positive");
	}
}

class TestRacine {
	public static void main(String[] arg) {
		double precision, operande, valeurRacine;
		try {
			Scanner s = new Scanner(System.in);
			
			System.out.println("Donnez une préicision :");
			precision=s.nextDouble();
			
			System.out.println("Donnez l'opérande :");
			operande=s.nextDouble();
			
			Racine r1 = new Racine(precision);
			valeurRacine = r1.calcul(operande);
			System.out.println("La valeur de la racine est "+valeurRacine);
		} catch(ExceptionRacine e) {
			System.out.println("La valeur de l'opérande est négative, renseignez une opérande positive");
		}
	}
}
