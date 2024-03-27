package studio7;

public class rectangle {

	private int length;
	private int width;
	

	public rectangle(int length, int width) {
		this.length= length;
		this.width = width;
	}
	
	public double area()
	{
		double area = length* width;
		
		return area;
	}
	
	public double perimeter()
	{
		double perimeter = (length*2.0)*(width*2.0);
		return perimeter;
	}
	
	public boolean isLessThan(rectangle other) {
		
		if (this.area() < other.area())
			return true;
		
		else 
			return false; 
	}
	
	public boolean square()
	{
		if (this.length== this.width)
			return true;
		else
			return false;
	}
	
}
