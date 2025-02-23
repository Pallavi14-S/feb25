class Fib
{
public static void main(String args[])

{
int num=0,num1=1,num2;

for(int i=0;i<10;i++)
{
num2= num1+num;
System.out.println(num2);
num=num1;
num1=num2;

}
}
}
