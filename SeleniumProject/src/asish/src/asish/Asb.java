package asish;

public class Asb {
	
	public static void main(String[] args){

		System.out.println(m1());

		}
		public static int m1(){

		try{

		         System.out.println(10/0);
				 return 5;
		         
		}

		catch(ArithmeticException e){


			System.out.println(10/0);
			return 6;
			
		}
		     finally {
		    	 
		    	 System.out.println(10/2);
		    	 
		     }
			
			 



		}



		}

		