package abcd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import asish.Test1;

public class Test123 {
Test1 t=new Test1();
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("location");
		} catch (FileNotFoundException e) {

			e.getMessage();
		}
              System.out.println("Ashish");
              System.out.println(3+2);
	            
	
	}

}
