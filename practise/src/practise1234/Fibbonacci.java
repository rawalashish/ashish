package practise1234;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		

	Scanner scan=new Scanner(System.in);	
	
	System.out.println("upto what terms you want series");	

		int limit=scan.nextInt();
		
		
		System.out.println("enter two number");
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a+" ");
		System.out.print(b+" ");
		int c=a+b;
		limit=limit-2;
		
		while(limit>0){

		System.out.print(c+" ");
		a=b;
		b=c;
		c=a+b;
		
		limit--;
		
				
	
		
		}
				

	}
}
