package chapter1;

public class Voiture {
	
	int km;  // attribut d'instance
	
	static int MaxSpeed = 300; // attribut de classe
	
	public Voiture() {    // constructeur
		System.out.println("Un Constructeur");
	}
	
	public void info() { // m�thode d'instance
		
		System.out.println("Une m�thode d'instance");
	}
	
	public static void affichage() { // m�thode de classe
		
		System.out.println("Une m�thode de classe");
	}
	
	//Bloc d'initialisation d'instance
	{
		System.out.println("Bloc d'initialisation d'instance n� 1");
	}
	
	//Bloc d'initialisation de classe
	static{
		System.out.println("Bloc d'initialisation de classe N1");
	}
	
	static{
		System.out.println("Bloc d'initialisation de classe N2");
	}
	
	//Bloc d'initialisation d'instance
		{
			System.out.println("Bloc d'initialisation d'instance n� 2");
		}
}
