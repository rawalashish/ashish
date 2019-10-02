package practise1234;

import java.util.Scanner;

public class DiamondPattern1 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		System.out.println("enter row ");
		int row=scan.nextInt();
		int row1=row;
		int row2=row;
			
                  for(int i=0;i<=row;i++){
                	  
                	  
                	  for(int j=row1;j>0;j--){
                		  
                		  System.out.print(" ");
                		  
                		                		  
                                        	}
                	  row1--;
                	  
                	  for(int k=0;k<=i;k++){
                		  
                		  System.out.print(" * ");
                		  
                		  
                	  }
                	 
                	  
                	  System.out.println();
                	  
                  }

                  
                  for(int i=0;i<row;i++){
                	  
                	  for(int j=0;j<=i;j++){
                		  
                		  System.out.print(" ");
                	                        
                	                      }
                	  
                	  for(int k=0;k<row2;k++){
                		  
                		  System.out.print(" * ");
                		  
                	                          } 
                	  row2--;
                	  
                	    System.out.println();
                	                    }
                  
	}

}
