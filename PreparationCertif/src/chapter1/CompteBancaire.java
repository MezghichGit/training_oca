package chapter1;

public class CompteBancaire {
	// Les attributs
	
	double solde;
	int rib;
	String client;
	
	// Les méthodes
	
	public CompteBancaire() {  // un constructeur par défaut(sans paramètres)
		System.out.println("Compte crée avec succés, Constructeur 1");
	}
	
	public CompteBancaire(String c, int r, double s) {  // un constructeur avec paramètres
		client = c;
		rib = r;
		solde = s;
		System.out.println("Compte crée avec succés, Constructeur 2");
	}


	public void solde()
	{
		System.out.println("Votre solde est : " + solde);
	}
	
	public void info()
	{
		System.out.println("Le client est =" +client+" RIB : "+rib +" Solde :"+solde);
	}

}
