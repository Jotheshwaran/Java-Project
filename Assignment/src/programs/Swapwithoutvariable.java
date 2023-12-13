package programs;

import java.util.*;

public class Swapwithoutvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sl = new Scanner(System.in);
		
		System.out.println("Enter the values of a :");
		int a = sl.nextInt();
		
		System.out.println("ENter the values of b :");
		int b= sl.nextInt();
		
		System.out.println("Before swapping of a :"+a);	
		System.out.println("Before swapping of b :"+b);
		System.out.println("------------");
		
		a=a+b;
		b=a-b;
		a=a-b;
		 System.out.println("After swapping of a :"+a);
		 System.out.println("After swapping of b :"+b);
		 sl.close();
		
	}

}
