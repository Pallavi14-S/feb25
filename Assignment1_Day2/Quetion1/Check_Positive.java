import java.util.Scanner;

class Check_Positive
{
	public static void main(String args[])
		{

			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Number");

			int num=sc.nextInt();

			if(num>=0)
			{
				System.out.println("Given number is positive");
			}


			else
			{
				System.out.println("Given number is negative");

			}
		}

}

			