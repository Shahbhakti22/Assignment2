
import java.util.*;
public class Assignment2
{
  public static void main (String args[])
   {
	   int num1,num2,add,sub,mul,div,mod;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter first number:");
	   num1=sc.nextInt();
	   System.out.println("Enter second number:");
	   num2=sc.nextInt();
	   add=num1+num2;
	   System.out.println("Addition of two num:" + add);
	   sub=num1-num2;
	   System.out.println("Subtraction of two num:" + sub);
	   mul=num1*num2;
	   System.out.println("Multiplication of two num:" + mul);
	   div=num1/num2;
	   System.out.println("Divison of two num:" + div);
	   mod=num1%num2;
	   System.out.println("Modulus of two num:" + mod);
	   
	   
	
   }
	  
 

}