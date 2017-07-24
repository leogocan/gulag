package modeliranje;

import java.util.Scanner;

public class likovi {
	
	
public static void main(String[] args) {
	
	Scanner reader = new Scanner(System.in);
	System.out.println("Upiši duljinu stranice trokuta: ");
	double a = reader.nextDouble();
	
	System.out.println("Upiši duljinu stranice trokuta: ");
	double b = reader.nextDouble();
	
	System.out.println("Upiši duljinu stranice trokuta: ");
	double c = reader.nextDouble();
	
	System.out.println("Upiši duljinu radijusa kruga: ");
	double r = reader.nextDouble();
	
	System.out.println("Upiši duljinu stranice pravokutnika: ");
	double d = reader.nextDouble();
	
	System.out.println("Upiši duljinu stranice pravokutnika: ");
	double e = reader.nextDouble();

	trokut trokut= new trokut(a, b, c);
	System.out.println("površina trokuta je "+trokut.povrsinaT());
	System.out.println("opseg trokuta je "+trokut.opsegT());
	
	krug  krug=new krug(r);
	System.out.println("površina kruga je "+krug.povrsinaK());
	System.out.println("opseg kruga je "+krug.opsegK());
	
	pravokutnik pravokutnik= new pravokutnik(d, e);
	System.out.println("površina pravokutnika je "+pravokutnik.povrsinaP());
	System.out.println("opseg pravokutnika je "+pravokutnik.opsegP());
	
	}
}
