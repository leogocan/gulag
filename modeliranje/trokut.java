package modeliranje;

public class trokut {
	private double a;
	private double b;
	private double c;
	
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
		
	trokut trokut=new trokut(a, b, c);
	
	public double povrsina() {
		double s= (this.a + this.b + this.c)/2;
		return Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));
		
		
		
	}
	public double opseg() {
		return this.a+ this.b+ this.c;
		
	}
	
}
