import java.util.Scanner;

class Count
{

	public static void main(String args[])
	{

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter number");

		int a = sc.nextInt();
		int count = 0;
		int num;
		num=a;

		while(num!=0)
		{

			num=num/10;

			count++;

		}

		System.out.println("The number "+a+" has  "+count+" digits");

	}

}