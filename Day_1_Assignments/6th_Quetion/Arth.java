import java.util.Scanner;

class Arth
{
    public static void main(String args[])
       {

          Scanner sc = new Scanner(System.in);//Creating instance of scanner class
          int a=sc.nextInt();
          int b= sc.nextInt();

          System.out.println("125+24 = "+(a+b));
          System.out.println("125-24 = "+(a-b));
          System.out.println("125*24 = "+(a*b));
          System.out.println("125/24 = "+(a/b));
          System.out.println("125 mod 24 = "+(a%b));

}
}
