/*

Q20:  Implement a Java program that  returns the absolute value  of a given number using 
the ternary operator (without using  Math.abs()  ). 

*/

import java.util.Scanne;

class Ternary5

{
	public static void main(String args[])
	
	{
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		System.out.println((num<0? -num: num));
		
	}
}
		
		