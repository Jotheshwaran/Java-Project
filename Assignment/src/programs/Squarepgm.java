package programs;

import java.util.Scanner;

public class Squarepgm {
	
	public static int square(int a)
	{
		int b=a*a;
		return b;
	}
	
	public int rect(int l,int h)
	{
		int r=l*h;
		return r;
		
	}
	
	public static int triangle(int l,int h)
	{
		int t=l*h/2;
		return t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the values if a : ");
		int a1 = sc.nextInt();
		
		System.out.println("Area of square :"+square(a1));
		
		Squarepgm m1 = new Squarepgm();
		int c=m1.rect(2, 4);
		System.out.println("Area of rectangle :"+c);
		
		System.out.println("Area of triangle :"+triangle(3,6));
	}

}
