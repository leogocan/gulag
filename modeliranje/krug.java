package modeliranje;


public class krug {
	double r;

	public krug(double r) {
		this.r = r;
	}

	public double getR() {
		return this.r;
	}

	public void setR(double r) {
		this.r = r;
	}
	public double opsegK() {
		return 2*this.r*3.14 ;
	}
	public double povrsinaK() {
	return r* r* 3.14 ; 
	}

}
