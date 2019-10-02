package practise1234;

import java.util.Scanner;

public class ReverseEqualsOriginal {

	public static void main(String[] args) {
		
		int rem=0;
		int rev=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
		int num=scan.nextInt();

		while(num>0){
			
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
			
			
		}
		
		
		System.out.println("reversed number is  "+rev);
		
		
		
		
		                       }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


