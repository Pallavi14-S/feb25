/*Q17:  Implement a Java program that finds the  minimum of four numbers  using nested 
ternary operators.

*/

import java.util.Scanner;

class Ternary1
{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
int num2 = sc.nextInt();

int num3 = sc.nextInt();
int num4 = sc.nextInt();


System.out.println((num1<num2)?(num1<num3?
(num1<num4?"number= "+num1+" is lesser.":"number = "+num4+" is lesser"):
(num3<num4?"number = "+num4+" is lesser":"number= "+num3 +" is lesser"))
:(num2<num3?(num2<num4?"number "+num4+" is lesser":"number =" +num2+" is lesser"):
(num3<num4?"number ="+num3+" is lesser":"number ="+num4+" is lesser")));

}

}