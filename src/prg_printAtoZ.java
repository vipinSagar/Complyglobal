
public class prg_printAtoZ {

	public static void main(String[] args)
	{
		PrintingAtoZ();

	}
public static void PrintingAtoZ()
{
	char ch;
	for(ch = 'a' ; ch <= 'z' ; ch++)
	{
		System.out.print(ch+ " ");
	}
	System.out.println("");
	char ch1;
	for(ch1 = 'A' ; ch1 <= 'Z' ; ch1++)
	{
		System.out.print(ch1+ " ");
	}
}
}
