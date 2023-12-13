package programs;

import java.util.*;

public class Employeedetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lk = new Scanner(System.in);
		
		System.out.println("Enter the Employee name : ");
		String ename = lk.nextLine();
		
		System.out.println("ENter the Employee ID : ");
		int ID = lk.nextInt();
		
		System.out.println("Enter the Employee Desination : ");
		String deg = lk.next();
		
		System.out.println("Enter the year of experience : ");
		int yoe = lk.nextInt();
		
		System.out.println("Enter the Basic Salary : ");
		int bs = lk.nextInt();
		
		int hra = (bs*5/100);
		System.out.println("Hra Salary : "+ hra);
		
		int netsal = (hra+bs);
		
		System.out.println("Enter the PF : ");
		int pf = lk.nextInt();
		
		int net=(netsal-pf);
		
		System.out.println("Net salary : "+net);
	
		lk.close();
		
		
		
	}

}
