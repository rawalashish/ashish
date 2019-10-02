package practise1234;

import java.util.Scanner;

public class InsertionInMiddle {

	public static void main(String[] args) {
		int size;
		int index;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array size");
		size=scan.nextInt();
		int[] x=new int[size+1];
		
		System.out.println("please enter array element");
		
		for(int i=0;i<size;i++){
			
			x[i]=scan.nextInt();
			
			                   }
		System.out.println("the array you entered is");
		
		for(int enteredarray:x){
			
			System.out.print(enteredarray+"");
			
		}
		
		System.out.println();
		System.out.println("enter on which index you want to enter the number");
		
		index=scan.nextInt();
		
		for(int i=size;i>=index;i--){
			
			
			x[i]=x[i-1];		
			
				
	                   		}
	
		System.out.println(); 
		for(int y:x){
			
			System.out.print(y+"");
		}
		
		x[index]=6;
		
		System.out.println("updated array is");
		
		for(int updated:x){
			
			System.out.print(updated+"");
			
			
		}
		
		
		
		
		
		
		
	}

}
