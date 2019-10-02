package practise1234;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int factorial=1;
		Scanner scan=new  Scanner(System.in);
		
		System.out.println("enter any number : ");
		
		int num=scan.nextInt();
		
		while(num>=1){
			
			factorial=factorial*num; 			
			num--;
			
		}
		
		System.out.println("factorial of number is :  "+factorial);
		

	}

}
