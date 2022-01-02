package chapter1;

public class MainProduit {

	public static void main(String[] args) {
		
		
		Produit p1 = new Produit();
		Produit p2 = new Produit();
		
		
		p2 = p1;
		p1=null;
		p2=null;
		//System.gc(); //appel au garbage collector
		for(int i = 0; i<100; i++)
		{
			System.out.println("i = "+i);
		}
		/*int x = 10; // x est une variable locale = déclaré dans une méthode.
		System.out.println(x);
		Produit p1 = new Produit(); // une première instance
		Produit p2 = new Produit(); // une deuxième instance
		
		Produit.info(); // appel à la méthode de classe
		p1.affichage(); // appel à la méthode d'instance
		
		p1.info();
		p1.nbre = 10;
		System.out.println(Produit.nbre);
		System.out.println(p2.nbre);
		p2.nbre = 22;
		System.out.println(Produit.nbre);
		System.out.println(p1.nbre);
		/*
		p1.libelle = "pc";
		p1.prix = 2000;
		p2=p1;
		System.out.println(p1.libelle + " "+ p1.prix);
		System.out.println(p2.libelle + " "+ p2.prix);
		System.out.println(p1==p2);
		System.out.println(Produit.nbre);
		Produit.nbre = 5;
		System.out.println(Produit.nbre);*/
		System.out.println("Suite du programme...");

	}

}
