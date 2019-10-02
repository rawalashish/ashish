package practise1234;

import java.util.Scanner;

public class SelectionSort1 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		int[] x=new int[5];
		
		int temp;
		for(int i=0;i<x.length;i++){
			
			System.out.println("enter"+i+"th element");
			
			x[i]=scan.nextInt();
			
						
			
		                           }
		
		for(int i=0;i<x.length;i++){
			
			
			for(int j=i+1;j<x.length;j++){
				
				
				if(x[i]>x[j]){
					
				                temp=x[i];
				                x[i]=x[j];
				                x[j]=temp;                
				                
					    
					
					
				              }
				
							
			                              }
					
			
			
			
			
		}
		
		for(int y:x){
			
			
			System.out.print(y);
			
		}
		
		
		
		
		
		
		
		
		

	}
}
