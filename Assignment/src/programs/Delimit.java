package programs;
import java.util.*;
public class Delimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Joe/naveen/Dhanya";
		Scanner sn = new Scanner(s);
		sn.useDelimiter("/");
		
		while(sn.hasNext())
		{
			System.out.println(sn.next());
		}
		sn.close();
		
	}

}
