package practise1234;

 class Parent {
	public  void show(){
		
		System.out.println("parent method");
		
	}}
	
 class child extends Parent{
	 
	 public  void show(){
		 System.out.println("child class method");
		 
	 }
 }
	 
	  class Test{
		 
		 public static void main(String[] args){
		 
		// Parent p=new Parent();
		 //p.show();
		 Parent p1=new child();
		 p1.show();
		 }
		 
	 }
	 
	 
 
	
	


