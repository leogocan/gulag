package modeliranje;

public class trokut {
	private double a;
	private double b;
	private double c;
	//private double s; (procitaj dolje zasto mislim da treba tu ic)
	
	public trokut(double a, double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public double getA() {
		return this.a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return this.b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return this.c;
	}
	public void setC(double c) {
		this.c = c;
	}
		
	trokut trokut=new trokut(a, b, c);  //brijem da ti je ovo nepotrebno tu, koliko znam ovo ide unutar main metode
	
	public double povrsina() {
		double s= (this.a + this.b + this.c)/2;  /*mislim da ti ovo ne smije ic ovdje, vec gore ili mozda i moze al brijem da je ono gore 
							    potrebno. Ja cu sad te kombe isprobavat pa vidjet radi li. */
		return Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));
		
		
		
	}
	public double opseg() {
		return this.a+ this.b+ this.c;
		
	}
	
}
