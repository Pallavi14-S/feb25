class Reverse

{

public static void main(String args[])


{

int num=1234;

int rev=0;
int sum=0;
while(num!=0)

{
rev=num%10;
num=num/10;
sum=sum*10+rev;

}

System.out.println(sum);


}

}
