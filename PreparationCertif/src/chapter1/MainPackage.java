package chapter1;

import chapter2.*;
import chapter3.*;
import chapter3.chapter33.E;


//import java.lang.String; // redondant

public class MainPackage {
	
	static int somme(int ch,int ...x)
	{
		int som = 0;
		for(int i = 0; i<x.length; i++)
		{
			som = som + x[i];
		}
		return som;
	}
	/*
	public static int somme(int x, int y)
	{
	 return x+y;
	}

	public static int somme(int x, int y, int z)
	{
		return x+y+z;
	}
	
	public static int somme(int x, int y, int z, int v)
	{
		return x+y+z+v;
	}*/
	 static final public  void main(String ... args) {
		System.out.println(somme(1));
		System.out.println(somme(10));
		System.out.println(somme(10,2,17,9));
		
		String Public = "Hello";
		String True ="Hi";
		/*
		chapter3.A a = new chapter3.A();
		chapter3.A a2 = new chapter3.A();
		B b = new B();
		C c = new C();
		E e = new E();
		String ch = "OCA";
		System.out.println("Hello Java");
		Animal a4 = new Animal();
		
		Cours c1 = new Cours();
		Employer emp = new Employer();
		int $x = 10;
		int $ = 20;
		int _x = 10;
		System.out.println(_x);
		System.out.println(ch.length());
		c1 = null;
		ch = null;
		//_x = null;*/
		
		System.out.println(Long.MAX_VALUE); //9223372036854775807
		System.out.println(Integer.MAX_VALUE); //2147483647
		    //9223372036854775807
		long k = 2;
		long x = 214748364722L;  // 32 bits ==> 64 bits
		float y = 12.5f ;//32 bits  // float 32 bits
		double z = 12.5;
		
		int h = 100_000_000;
		int x2 = 0X12F; // 12F est exprimé dans la base héxa
		int y1 = 0b11; // 11 est dans la base binaire
		int y4 = 071; //Nombre exprimé dans la base octable//   1 * 8^0 + 7 * 8^1 => Nombre dans la base décimale
		
		System.out.println(x2);
		System.out.println(y1);
		System.out.println(y4);
		
		

	}

}
