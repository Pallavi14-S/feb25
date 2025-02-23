import java.util.Scanner;

class Power
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base number");

		int base=sc.nextInt();

		System.out.println("Enter Exponent number");
		int exponent= sc.nextInt();
		int ans=1;
		
		for(int i=1;i<=exponent;i++)
		{
			ans=ans*base;
		}
		

		System.out.println(base+" raised to the power "+exponent+" is "+ ans);


	}

}