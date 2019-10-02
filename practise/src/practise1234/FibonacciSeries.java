package practise1234;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int c=0;
		
		Scanner scan=new Scanner(System.in);
				
		System.out.println("enter first number ");
		
		int a=scan.nextInt();
		
		System.out.println("enter second number");
		
		int b=scan.nextInt();
		
		
		System.out.println("enter the length required ");
		
		
		int length=scan.nextInt();
		
		System.out.print(a+" "+b+" ");
		
		
		c=a+b;
		
		for(int i=0;i<length-2;i++){
			
			System.out.print(c+" ");
			
			a=b;
			b=c;
			c=a+b;
			
			
			
			
		                            
		                           }
		
		
		
		
		
		
		

	}

}
