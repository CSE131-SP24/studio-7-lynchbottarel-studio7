package studio7;

public class Die {
	
	
	private int numSides;

	public Die(int innumSides)	{

		
		numSides = innumSides;
		
	}
	
	public  void rollDie(Die name)	{
		
		int roll = (int)((Math.random()*numSides)+1);
		System.out.println(roll);
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Die d6 = new Die(6);
		d6.rollDie(d6);
		
		
	}

}
