package practise1234;

import java.util.Scanner;

public class CountAlphabat {

	public static void main(String[] args) {

		
		int count;
      Scanner scan=new Scanner(System.in);
      
      System.out.println("enter string value");
      
      String input=scan.nextLine();
      
      for(char i='A';i<'z';i++){
    	  
    	  count=0;
    	  
    	  for(int j=0;j<input.length();j++){
    		  
    		  char ch=input.charAt(j);
    		  
    		  if(ch==i){
    			  
    			  count++;
    			  
    		                		}
    		  
    		  
    	                                   }
    	  
    	  
    	  if(count>0){
    	  System.out.println("The variable "+i+" has occured "+count+" times ");
                               }
      
		

	}

}
}