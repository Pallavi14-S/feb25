import java.util.Scanner;

class PowerofTwo
{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);

int num = sc.nextInt();

if((num>0) && ((num & (num-1))==0))
{

System.out.println(num+" is power of 2");

}
else
{
System.out.println(num+" is not power of Two!!!!");

}

}

}

