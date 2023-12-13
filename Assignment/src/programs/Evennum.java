package programs;

import java.util.*;

public class Evennum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		//even numbers
		for(int i=1;i<num;i++)
		{
			if (i%2==0)
			{
				System.out.println(i + " ");
			}
		}	
		
		//odd numbers
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		for(int i = 0;i<=n;i++)
		{
			if (i%2 !=0)
			{
				System.out.println(i+" ");
			}
		}
		sc.close();
	}

}
