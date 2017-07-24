package modeliranje;

public class pravokutnik {
	double a;
	double b;
	

	public pravokutnik(double a, double b) {
		this.a = a;
		this.b = b;
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

	public double povrsinaP() {
		return this.a*this.b;
	}
	public double opsegP() {
		return 2*(a+b);
	}

}
