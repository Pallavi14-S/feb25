import java.util.Scanner;
class EvenOdd
{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);


int num = sc.nextInt();

if((num&1)==0)
{
System.out.println("Num is even");
}

else
{
System.out.println("Num is odd");
}

}

}