import java.util.Scanner;
/*
  Logic is T(Fahr) = 9*T(Cel)/5 +32 ;
 * */

public class FahrenheitToCelsiusTempConversion {
public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter The Tem In Fahrenheit");
		
		int Temp_InFahr = scn.nextInt();
		 int Temp_InCel = ((Temp_InFahr - 32)*5)/9;
		 System.out.println("Temprature In Celsius :"+Temp_InCel);

	}

}
