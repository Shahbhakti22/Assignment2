import java.util.*;
public class Assignment2c
{
	public static void main (String args[])
	{
		int sp,cp,profit,loss;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter cost price:");
		cp=sc.nextInt();
		System.out.println("Enter selling price:");
		sp=sc.nextInt();
	
		profit= sp - cp;
		System.out.println("Profit:" + profit);
		
		loss= cp - sp;
		System.out.println("loss:" + loss);
		
		
	}
	
	
}