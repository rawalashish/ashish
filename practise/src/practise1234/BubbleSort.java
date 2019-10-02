package practise1234;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		
		
		int size;
		int temp;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array size");
		size=scan.nextInt();
		int[] x=new int[size];
		
		System.out.println("please enter array elements");
		
		for(int i=0;i<size;i++){
			
			x[i]=scan.nextInt();
			
			            	   }
		System.out.println("the array you entered is :");
		for(int y:x){
			
			System.out.print(y+" ");
			
		            }
		System.out.println();
		System.out.println("sorting array please wait------");
		
		for(int i=0;i<size;i++){
			
			for(int j=0;j<size-1;j++){
				
				if(x[j]>x[j+1]){
					
				temp=x[j];
				x[j]=x[j+1];
				x[j+1]=temp;
					
						              }
							
		                        }
			
			
			
		                      }

	System.out.println();
	
	for(int sortedarray:x){
		
		System.out.print(sortedarray+" ");
		
		
	}
	
	}

}
