package studio7;

public class HockeyPlayer {

	private String name;
	private int jNumb;
	private String shootingSide;
	private String domHand;
	private int goalsScored;
	private int numAssist;
	private int numGames;

	public HockeyPlayer(String inname, int injNumb, String inshootingSide, String indomHand, int ingoalsScored, int innumAssist, int innumGames)	{

		name = inname;
		jNumb = injNumb;
		shootingSide = inshootingSide;
		domHand = indomHand;
		goalsScored = ingoalsScored;
		numAssist = innumAssist;
		numGames = innumGames;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HockeyPlayer Jake = new HockeyPlayer( "Jake" , 78 ,  "Left" , "Right" , 20 , 30 , 50);

		ptsTest(Jake);
		addGoals(Jake, 10);
		addAssist(Jake, 10);

		ptsTest(Jake);
		totalStats(Jake);


	}



	public static  void ptsTest(HockeyPlayer Jake)	{

		System.out.println(Jake.goalsScored + Jake.numAssist);

	}
	public static  int addGoals(HockeyPlayer Jake, int newGoalsScored)	{

		Jake.goalsScored += newGoalsScored;

		return Jake.goalsScored;

	}
	public static  int addAssist(HockeyPlayer Jake, int newNumAssists)	{

		Jake.numAssist += newNumAssists;

		return Jake.numAssist;
	}
	public static  void totalStats(HockeyPlayer Jake)	{
		System.out.println(Jake.name);
		System.out.println(Jake.jNumb);
		System.out.println(Jake.shootingSide);
		System.out.println(Jake.domHand);
		System.out.println(Jake.goalsScored);
		System.out.println(Jake.numAssist);
		System.out.println(Jake.goalsScored + Jake.numAssist);
	}
}


