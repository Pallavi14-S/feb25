import java.util.Scanner;//Import this file for taking input

class Sum
 { 
   public static void main(String args[])
  { 
    Scanner sc = new Scanner(System.in);//Creating scanner class object

    System.out.println("Enter value for a = ");
    int a= sc.nextInt();//Enter 1st number

    System.out.println("Enetr value for b = ");
    int b= sc.nextInt();//Enter 2nd number
    
    int c= a+b;
    System.out.println("Sum of given number is = " +c);
//Addition of two numbers
}
}
    
