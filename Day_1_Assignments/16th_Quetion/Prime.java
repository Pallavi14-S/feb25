import java.util.Scanner;

class Prime

{
     public static void main(String args[])
     {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number");
        int a= sc.nextInt();
        int flag=0;

        for(int i=2;i<a;i++)
        {

           if((a%i)==0)
         {

          System.out.println("Number " +a+" Not prime");


         }
        flag=1;
          }

if(a!=1 && flag==0)
{

System.out.println("Number " +a+" is prime");
}

if(a==1)
{
System.out.println("Number 1 is not prime");
}


}

}

