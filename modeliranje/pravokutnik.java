package modeliranje;

public class pravokutnik {
	double a;
	double b;
	
	
	public pravokutnik(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public static double c=2.2;
	public static double d=3.3;
	public static void povrsina(double a, double b) {
		double pov=a*b;
		System.out.println("površina pravokutnika je "+ pov);
	}
	public static void opseg(double a, double b) {
		double ops=2*a+ 2*b;
		System.out.println("opseg pravokutnika je "+ ops);
	}
	public static void main(String[] args) {
		
		pravokutnik.povrsina(c, d);
		pravokutnik.opseg(c, d);
	}
}
