package practise1234;

import java.util.Scanner;

public class DeleteElementFromArray {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter size of an array");
		int size=scan.nextInt();
		int[] x=new int[size];
		
		System.out.println("enter array elements");
		
		
		for(int i=0;i<size;i++){
			
			x[i]=scan.nextInt();
			
		                       }
		
     System.out.println("Entered array is :");
     
     
     for(int enteredarray:x){
    	 
    	 System.out.print(enteredarray+" ");
    	 
                            }
     System.out.println();
	System.out.println("enter the index value you want to delete");	
	
        int index=scan.nextInt();
                          
     for(int i=index;i<size-1;i++){
    	 
    	 x[i]=x[i+1];
    	 
     }
        
        for(int i=0;i<size-1;i++){
        	
        	System.out.print(x[i]+" ");
        	
        }
	}

}
