import java.util.Scanner;

class Table
{

public static void main(String args[])

{
Scanner sc= new Scanner(System.in);//Creating Scanner object to take input

int a = sc.nextInt();//Taking input

for(int i=1;i<=10;i++)
{
System.out.println(a+" * "+i+" = "+(a*i));
}

}

}