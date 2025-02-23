import java.util.Scanner;

class Celsius
{
    public static void main(String args[])
 	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Celsius");
 		int celsius = sc.nextInt();

		double fehrenhit= (celsius * (9/5))+32;
		
		System.out.println(celsius+" C is equal to " + fehrenhit);

	}


}
		