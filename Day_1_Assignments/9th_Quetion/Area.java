import java.util.Scanner;

class Area
{
public static void main(String args[])

{

Scanner sc = new Scanner(System.in);

int r =  sc.nextInt();
float pi = 3.14f;
double area= pi*(r*r);

System.out.println("Area of the circle: " +area);

}

}