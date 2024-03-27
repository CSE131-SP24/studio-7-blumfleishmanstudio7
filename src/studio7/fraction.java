package studio7;

public class fraction {
	
	private int numerator;
	private int denominator;
	
	public fraction(int n, int d)
	{
		this.numerator = n;
		this.denominator = d; 
	}
	public double frac()
	{
		double f = (this.numerator) /(this.denominator);
		return f;
	}

	public double add(fraction other)
	{
		double num = (this.frac() ) + (other.frac());
		return num;
	}
	
	public double multiply(fraction other) {
		double m = (this.frac() ) * (other.frac());
		return m;
	}
	
	public double reciprocal(){
		
		double r = 1.0/(this.frac());
		return r;
	}
	
	public double simplify (double n)
	{
		if (this.numerator % n == 0 && this.denominator % n == 0)
		{
			double j= (this.frac())/n ;
			return j;
		}
		else
			return this.frac();
		
	}
}
