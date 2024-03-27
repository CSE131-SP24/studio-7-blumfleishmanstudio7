package studio7;

public class complex {
	
	private double a;
	private double b; 
	
	
	public complex(int a, int b)
	{
		this.a = a;
		this.b= b;
	}
	public double number()
	{
		double n = this.a + this.b ;
		return n;
	}

	public double add(complex other)
	{
		double num = (this.number()) + other.number();
		return num;
	}
	
	public double multiply(complex other)
	{
		double p = this.number() * other.number() ;
		return p;
		
	}

}
