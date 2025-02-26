class DigitSum

{

public static void main(String args[])

{

int num=9876;

int sum=0;
int temp;
while(num!=0)

{
temp=num%10;
num=num/10;
sum=sum+temp;

}

System.out.println(sum);

}
}
