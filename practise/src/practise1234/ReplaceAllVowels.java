package practise1234;

import java.util.Scanner;

public class ReplaceAllVowels {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter input string ");
		
		String input=scan.nextLine();
		
		String modified=input.replaceAll("[A,E,I,O,U,a,e,i,o,u]"," ");
		
		System.out.println(modified);
		
		

	}

}
