package practise1234;

import java.util.Scanner;

public class StringSorting {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		String[] x=new String[2];
		
		for(int i=0; i<2;i++){
			
			System.out.println("Enter"+i+"th string value");
			
			x[i]=scan.nextLine();
			
			
		                     }
		
		for(String y:x){
			
			
			System.out.print(y+" ");
		               
		               }

		
		for(int i=0;i<2;i++){
			
			for(int j=1;j<2;j++){
				
				if(x[i].compareTo(x[j])>0){
					
					String temp=x[i];
					
					x[i]=x[j];
					
					x[j]=temp;
					
					
					
				}
				
				
				
			}
			
		
		
		
		}
		
		System.out.println();
		
		for(String z:x){
			
			System.out.print(z+" ");
			
		}
		
		
	}

}
