package chapter1;

public class CompteBancaire {
	// Les attributs
	
	double solde;
	int rib;
	String client;
	
	// Les m�thodes
	
	public CompteBancaire() {  // un constructeur par d�faut(sans param�tres)
		System.out.println("Compte cr�e avec succ�s, Constructeur 1");
	}
	
	public CompteBancaire(String c, int r, double s) {  // un constructeur avec param�tres
		client = c;
		rib = r;
		solde = s;
		System.out.println("Compte cr�e avec succ�s, Constructeur 2");
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
