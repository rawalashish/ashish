package practise1234;

import java.util.Scanner;

public class BubbleSort1 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		int size;
		System.out.println("enter size of array");
        
		size=scan.nextInt();
		
		System.out.println();
		int[] x=new int[size];
		
		for(int i=0;i<size;i++){
			
			System.out.println("enter"+i+"th element");
			x[i]=scan.nextInt();
			System.out.println();
			
		                       }
		
		System.out.println("The entered array is");
		
		for(int enteredarray:x){
			
			System.out.print(enteredarray+"  ");
			
		                       }
		
		System.out.println("......sorting please wait...............");
		
		for(int i=0;i<size-1;i++){
			
			for(int j=0;j<size-i-1;i++){
				
				if(x[j]>x[j+1]){
					
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
					
								
					
					
					
					
				}
				}
		
			System.out.println("\n\n");
			
		for(int array:x){
			
			System.out.print(array+" ");
			
		}
		}
		
		
		
	}

}
