package practise1234;

import java.util.Scanner;

public class LargestInArray {

	public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
    System.out.println("enter array size");
	int largest;
	int size=scan.nextInt();
		
	int[] x=new int[size];
	 
  	System.out.println("enter array elements");
  	
  	for(int i=0;i<size;i++){
  		
  		x[i]=scan.nextInt();
  		
  		
  	                        }
  	
  	for(int enteredarray:x){
  		
  		System.out.print(enteredarray+" ");
  		
  	                        }
	
  	largest=x[0];
  	
	for(int i=0;i<size;i++){
		
		
		for(int j=1;j<size;j++){
			
			if(x[j]>largest){
				
				largest=x[j];
				
				
			}
			
			
			
			
		}
		
		
		
		
		
	}
	System.out.println("largest element is"+largest);
	
}
}
