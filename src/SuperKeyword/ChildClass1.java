package SuperKeyword;

public class ChildClass1 extends ParentClass1{
	
	ChildClass1(){
		
//super() must be added to the first statement of constructor otherwise you will get a compilation error. 
//Another important point to note is that when we explicitly use super in constructor the compiler doesn't invoke 
//the parent constructor automatically.	
	
	super("Monika");
	System.out.println("Constructor of child class");		
			
	}
			
	void display(){
				
	System.out.println("Hello!");
			
	}			

	public static void main(String[] args) {
		
		ChildClass1 cc1 = new ChildClass1();
		cc1.display();
		
	}
}
