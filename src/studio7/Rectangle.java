package studio7;

public class Rectangle {

	private int length;
	private int width;
	private int area;
	private int perim;

	public Rectangle(int inlength , int inwidth) 
	{	
		length = inlength;
		width = inwidth;
		area = length * width;
		perim = (2 * length + 2 * width);
	}
	public  void squareTest(Rectangle name)	{

		if(length == width)
		{
			System.out.println("Square");
		}
		else {
			System.out.println("Rectangle");
		}
	}

	public  void bigger(Rectangle name1, Rectangle name2)	{

		if(name1.area == name2.area)
		{
			System.out.println("no contest");
		}
		else if (name1.area > name2.area) 
		{
			System.out.println("Rectangle" + name1 + " is bigger");
		}
		else {
			System.out.println("Rectangle" + name2 + " is bigger");
		}
	}




	public static void main(String[] args)
	{
		Rectangle reggy = new Rectangle(8,8);
		Rectangle noreggy = new Rectangle(7,8);
		reggy.squareTest(reggy);
		noreggy.squareTest(noreggy);
		bigger(reggy, noreggy);
	}

}
