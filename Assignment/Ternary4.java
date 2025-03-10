/*
Q19:  Write a Java program that checks whether a character is  uppercase, lowercase, or 
not a letter  using only the ternary operator.
*/


import java.util.Scanner;
class Ternary4
{
	public static void main(String args[])
	{
		
		
	Scanner sc = new Scanner(System.in);
	
	char ch = sc.next().charAt(0);
	
	System.out.println((ch>=65 && ch<=90)?"Uppercase Letter":
	(ch >=97 && ch<=122)?"Lowercase Letter":"Not a letter");
	
	}
	
}
	
	
	
	
	
	
	
	
	
	