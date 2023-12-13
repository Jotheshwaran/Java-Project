package programs;

public class Stringfn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Welcome to coding";
		String s2= "SOFTWARE TESING";
		String s3= "Welcome to coding";
		
		//charAt
		System.out.println("The charcter value is :"+ s1.charAt(5));
		System.out.println("----------------------");
		
		//compareTo
		System.out.println("The compare of two string is :"+ s1.compareTo(s3));
		System.out.println("----------------------");
		
		//concat
		System.out.println("The concat is :"+ s1.concat(s2));
		System.out.println("----------------------");
		
		//contains
		System.out.println("The contains is :"+ s1.contains(s3));
		System.out.println("----------------------");
		
		//contentequals
		System.out.println("The content is equal or not :"+ s1.contentEquals(s2));
		System.out.println("----------------------");
		
		//endswith
		System.out.println("Check a string ends with character : "+ s2.endsWith("testing"));
		System.out.println("----------------------");
		
		//uppercase
		String ch= s1.toUpperCase();
		System.out.println("Uppercase :"+ ch);
		System.out.println("----------------------");
		
		//lowercase
		System.out.println("Lowercase :"+ s2.toLowerCase());
		System.out.println("----------------------");
		
		//replace
		System.out.println("Replace a character :"+ s1.replace('o', 'a'));
		System.out.println("----------------------");
		
		//replaceall
		System.out.println("Replace a word :"+ s1.replaceAll("coding", "program"));
		System.out.println("----------------------");
		
	}

}
