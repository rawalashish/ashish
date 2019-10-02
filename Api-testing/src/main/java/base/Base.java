package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base {
	
	             public Properties pr;
	public Base(){
		
		try{
			pr=new Properties(); 
			FileInputStream fis =new FileInputStream("E:\\eclipse program\\Api-testing\\src\\main\\java\\config\\config.properties");
			pr.load(fis); 
				 
		   }
		
		catch(FileNotFoundException  fo){
			
			fo.printStackTrace();
		}
		catch (IOException io){
			io.printStackTrace();
		}
		
		
	}

}
