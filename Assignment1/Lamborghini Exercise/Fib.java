class Fib

{

public static void main(String args[])

{
int num0=0;
int num1=1;
int num2=1;
int num;

System.out.println(num1);

while(num2!=21)

{

num2=num1+num0;
num0=num1;
num1=num2;

System.out.println(num2);

}


}

}




