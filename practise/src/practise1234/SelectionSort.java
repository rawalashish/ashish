package practise1234;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		int size;
		int temp=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array size");
		size=scan.nextInt();
		int[] x=new int[size];
		
		
		System.out.println("enter array elements");
		
		for(int i=0;i<size;i++){
			
			
			x[i]=scan.nextInt();			
					
		                       }
		
		System.out.println("the array you entered is :");
		
		
		for(int enteredarray:x){
			
			System.out.print(enteredarray+" ");
			
			            	   }
		
		System.out.println();
		
		System.out.println("please wait array is being sorted");
		
         for(int i=0;i<size;i++){
        	 
        	 for(int j=i+1;j<size;j++){
        		 
        		 if(x[i]>x[j]){
        			 
        			 temp=x[i];
        			 x[i]=x[j];
        			 x[j]=temp;
        		              
        		               }
        		 
        		 
                                  	 }
        	 
        	 
        	 
                                  }		
         
         
         for(int y:x){
        	 
        	 
        	 System.out.print(y+" ");
        	 
                     }
		

	}

}
