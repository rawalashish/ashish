package practise1234;

import java.util.Scanner;

public class CheckArmstrong {

	
	public static void main(String[] args){
		
		int rem=0 ;
		
		int arms=0;
		
		Scanner scan=new Scanner(System.in)	;
		
		System.out.println("enter any number");
		
		int num=scan.nextInt();
		
		int x=num;
		
		while(num>0){
			
			rem=num%10;
			
			arms=arms+rem*rem*rem;
			
			num=num/10;
			
			
			
		}

		if(arms==x){
			
			System.out.println("number is armstrong");
			
		}
		
		
		
		
		
		
		
	
		
	}
			
}
