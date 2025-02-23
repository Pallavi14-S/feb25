import java.util.Scanner;

class Rectangle

{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter length of the rectangle");
int length= sc.nextInt();

System.out.println("Enter width of the rectanle");
int width= sc.nextInt();

System.out.println("Area of the rectangle is: "+ (length*width));

}

}