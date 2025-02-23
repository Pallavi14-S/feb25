import java.util.Scanner;

class Reverse

{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.println("Enetr number");
int a= sc.nextInt();
int rev=0;

while(a>0)
{
int lastdigit= a%10;
rev=(rev*10)+lastdigit;
a=a/10;
}

System.out.println(rev);

}

}
