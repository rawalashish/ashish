package practise1234;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of an array");		
		int size=scan.nextInt();
		int[] x=new int[size];
		
		System.out.println("enter array elements ");
		
		for(int i=0;i<size;i++){
			
			x[i]=scan.nextInt();
			
			
		                       }
		System.out.println("elements entered are");
		
		for(int arrayelement:x){
			
			System.out.print(arrayelement+" ");
			
			                   }
		
		for(int i=0;i<(size/2);i++){
			
			int temp=x[i];
			x[i]=x[size-1];
			x[size-1]=temp;
			
			
		                            }
		System.out.println();
		
		for(int reversedarray:x){
			
			System.out.print(reversedarray+" ");
			
		}
		
	}

}
