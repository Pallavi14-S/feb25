import java.util.Scanner;

class Swap
{

public static void main(String args[])
{

Scanner sc = new Scanner(System.in);

int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("Old Value a= "+a+ " and b="+b);
a = a^b;
b= a^b;
a= a^b;

System.out.println("New Value a= "+a+"and b="+b);

}


}