package studio7;

public class die {
	
	private int n;
	
	public die(int n)
	{
		this.n = n;
	}
	
	public int roll()
	{
		int k = (int) (Math.random()*(this.n));
		return k;
	}

}
