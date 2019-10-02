package practise1234;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		
		System.out.println("enter rows you want ");
		Scanner scan=new Scanner(System.in);
		int row=scan.nextInt();
		int x=row;
		for(int i=0;i<=row;i++){
			
			for(int j=x;j>0;j--){
				
				System.out.print(" ");
			                      }
			for(int k=0;k<i;k++){
				
				System.out.print(" * ");
			                    }
			System.out.println();
			x--;
			
		}
		
		

	}

}
