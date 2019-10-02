package practise1234;

import java.util.Scanner;




public class Test124 {
	        
	
	
	
			public static void main(String[] args)  {
				
				int size;	
				int largest = 0;
				int z = 0;
				
				
		        Scanner scan=new Scanner(System.in);
		        System.out.println("enter array size");
		        size=scan.nextInt();
		        int[] x=new int[size];
		        System.out.println(size);
		        System.out.println("enter array elements");

				for(int k=0;k<size;k++){
					
					x[k]=scan.nextInt();
									
				                        }
				
				for(int i=1;i<size;i++){
					
					
					largest =x[0];
					if(largest<x[i]){
						
						largest=x[i];
						
					              }
					else {
						
						
						largest=x[0];
						
						
					}
					
					
				z=largest;
					//System.out.println("largest number is "+largest);

					
					
				                    }
				System.out.println("largest number is "+largest);
				
				
				
								
			}

		}




