class LargeDigit

{

public static void main(String args[])

{

int num=4825;
int num1=num;
int digit1=0;

int temp=0;
int digit2=0;int digit3=0;
while(num!=0)

{

digit1=num%10;

while(num1!=0)
{
digit2=num1%10;

if(digit1<=digit2)

{
digit1=digit2;
}
num1=num1/10;

}

num=num/10;


}

System.out.println(digit1);

}

}