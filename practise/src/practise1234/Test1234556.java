package practise1234;

import java.util.Scanner;

public class Test1234556 {

	public static void main(String[] args) {
		
		int count=0;
		char ch;
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter string");
		
		
		String name= scan.nextLine();
		
		for( ch='A';ch<='z';ch++){
			
			count =0;
			for(int i=0;i<name.length();i++){
			
				
			
			if (name.charAt(i)==ch){
				
				count++;
				
				
				
			                       }
			
			
			                        }
			
			if(count>0){
				
				System.out.println("the character "+ch+"has ocurred "+count+"times");
				
			
		                                      }
		
	
			
			
		}
		
		
		
	}

}
