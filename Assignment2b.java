import java.util.*;
public class Assignment2b
{
	public static void main (String args[])
	{
		int l,b,Ar,Br;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:");
		l=sc.nextInt();
		System.out.println("Enter breadth:");
		b=sc.nextInt();
		Ar=l*b;
		System.out.println("Area of rect:" + Ar);
		Br= 2 * (l+b);
		System.out.println("Perimeter of rect:" + Br);
	}

}