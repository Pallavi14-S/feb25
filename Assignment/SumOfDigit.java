import java.util.Scanner;
class SumOfDigit
{

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int num= sc.nextInt();

int sum=0;

int rev = 0;

while(num>0)
{
rev = num%10;
num = num/10;
sum= sum+rev;

}


System.out.println(sum);
}

}
