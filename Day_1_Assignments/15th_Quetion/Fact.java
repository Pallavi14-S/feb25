import java.util.Scanner;
class Fact
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.println("Enetr number");

int a=sc.nextInt();
int fact=1;

while(a>0)
{
fact=fact*a;
a=a-1;
}

System.out.println(fact);

}
}
