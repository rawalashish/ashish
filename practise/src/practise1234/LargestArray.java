package practise1234;

import java.util.Scanner;

public class LargestArray {

	public static void main(String[] args) {
		
		int[] x=new int[5];
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<5;i++){
		
		System.out.println("enter"+i+"array element");
		x[i]=scan.nextInt();
		
                		    }

		
		int largest=x[0];
		
		for(int i=1;i<5;i++){
			
			
			
			if(largest<x[i]){
				
				
				largest=x[i];
				
				
			                }
				
				
			                }		
		
		
		System.out.println("largest element is: "+largest);
		
		
		
		}
		
		
		
		
	                                       }

                              
