package practise1234;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("enter size of array");
	    
		int size=scan.nextInt();
		int[] x=new int[size];
		
		System.out.println();
		
		for(int i=0;i<size;i++){
			
			System.out.println("enter"+i+"element of array");
			
			x[i]=scan.nextInt();
			
		}
		
		System.out.println("\n entered array is");
		
		for(int enteredarray:x){
			
			System.out.print(enteredarray+"  ");
	     					
		}
		
		int largest=x[0];
		
		for(int i=1;i<size;i++){
			
			if(x[i]>largest){
				
				largest=x[i];
			                
			                }
			
	                       	  }
	
		System.out.println("The largest element is______"+largest);
		
	}

}
