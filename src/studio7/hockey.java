package studio7;

public class hockey {
	private String name;
	private int number;
	private boolean rightHand;
	private boolean rightShoot;
	private boolean leftShoot;
	private int goals;
	private int assists;
	private int games;
	
	
	public hockey(String name, int number, boolean Rhand, boolean Rshoot, boolean Lshoot, int g, int a, int games)
	{
			this.name = name;
	 		this.number = number;
			this.rightHand = Rhand;
			this.rightShoot = Rshoot;
			this.leftShoot = Lshoot;
			this.assists= a;
			this.goals = g;
			this.games = games;
	}
	
	public int points()
	{
		int p = this.goals + this.assists;
		return p;
	}
	
	public void goals()
	{
		this.goals+=1;
		
	}
	public void assists()
	{
		this.assists += 1;
	}
	
	public void games()
	{
		this.games+=1;
	}
	
	public String shoot()
	{
		if (this.rightShoot == true && this.leftShoot == true)
			return "ambidextrious";
		else if (this.rightShoot == true && this.leftShoot == false)
			return "right handed";
		else
			return "left handed";
	}

}
