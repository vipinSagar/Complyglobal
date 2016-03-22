import java.util.Scanner;


public class Swaping {
	public static Scanner scn = new Scanner (System.in);
	public static void main(String[] args) {
		SwappingWithoutTempVariable();
	}
	// Swaping with Temprory variable 
	public static void SwappingWithTempVariable()
	{
		System.out.println("enter the value of X :-");
		int x = scn.nextInt();
		System.out.println("enter the value of y :-");
		int y = scn.nextInt();

		int temp = x;
		x=y;
		y= temp;
		
		System.out.println("value of X : - " + x);
		System.out.println("value of Y : - " + y);
	}
	public static void SwappingWithoutTempVariable()
	{
		System.out.println("enter the value of X :-");
		int x = scn.nextInt();
		System.out.println("enter the value of y :-");
		int y = scn.nextInt();
		x= x+y;
		y=x-y;
		x=x-y;
		System.out.println("value of X : - " + x);
		System.out.println("value of Y : - " + y);
	}

}
