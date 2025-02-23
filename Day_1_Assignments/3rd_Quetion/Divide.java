import java.util.Scanner;//Import this file for taking input

class Divide
 { 
   public static void main(String args[])
  { 
    Scanner sc = new Scanner(System.in);//Creating scanner class object

    System.out.println("Enter value for a = ");
    int a= sc.nextInt();

    System.out.println("Enetr value for b = ");
    int b= sc.nextInt();
    
    int c= a/b;
    System.out.println("Division of given number is = " +c);
}
}
    
