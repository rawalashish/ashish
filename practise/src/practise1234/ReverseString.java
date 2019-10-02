package practise1234;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string ");
		
		String x=scan.nextLine();
		String rev="";
		
		int length=x.length();
		for(int i=length-1;i>=0;i--)
		{
			
			rev=rev+x.charAt(i);
			
		}
		
		System.out.println("The reverse string is---------------"+       rev );
		
		
		
		
		
		
		
		
		

	}

}
