import java.util.Scanner;
class Swap1
{

public static void main(String args[])

{
Scanner sc = new Scanner(System.in);

int a = sc.nextInt();
int b = sc.nextInt();

System.out.println("Before Swapping" +a+", "+b);

a+=b;
b= a-b;
a-=b;

System.out.println("After Swapping" +a+", "+b);


}

}