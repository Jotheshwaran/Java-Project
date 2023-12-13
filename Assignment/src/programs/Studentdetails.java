package programs;

import java.util.*;

public class Studentdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter Student ID : ");
		int ID= sc.nextInt();
		
		System.out.println("Enter the English mark : ");
		int English = sc.nextInt();
		
		System.out.println("Enter the Tamil mark : ");
		int Tamil = sc.nextInt();
		
		System.out.println("Enter the Maths mark : ");
		int Maths = sc.nextInt();
		
		System.out.println("Enter the Science mark : ");
		int Science = sc.nextInt();
		
		System.out.println("Enter the Social mark : ");
		int Social = sc.nextInt();
		
		System.out.println("------------------------");
		
		int Total = (English+Tamil+Maths+Science+Social);
		
		System.out.println("Total Marks : "+Total);
		
		int avg = (Total/5);
		
		System.out.println("Average marks : "+avg);
		
		System.out.println("------------------------");
		sc.close();
		
		
	}

}
