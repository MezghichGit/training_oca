package chapter1;

public class Produit {
	// attribut d'instance
	String libelle;
	double prix;
	
	//attribut de classe
	static int nbre;
	public Produit()  // méthode d'instance
	{
		nbre++; // nbre = nbre +1
	}
	
	public static void info()
	{
		System.out.println("Une méthode statique");
	}
	
	public void affichage(){
		System.out.println("Une méthode d'instance");
	}

	protected void finalize()
	{
		System.out.println("Desctruction d'un objet");
	}
}
