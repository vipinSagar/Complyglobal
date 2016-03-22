import java.util.Scanner;


public class GetInputFromUser {
	public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {


		String  name = sc.nextLine();
		System.out.println("Using nextLine we will print full string :-" + name);

	}

}
