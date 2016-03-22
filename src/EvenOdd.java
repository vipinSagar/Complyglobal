import java.util.Scanner;


public class EvenOdd {
	public static Scanner scn = new Scanner(System.in);
	public static String ans = "N";
	public static void main(String[] args) 
	{

		System.out.println("Enter a number to check Even n Odd !");
		int num = scn.nextInt();
		if(num%2==0)
		{
			System.out.println("It is Even Number !");
		}
		else
		{
			System.out.println("it is Odd !");
		}


	}

}
