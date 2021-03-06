package SuperKeyword;

public class ChildClass extends ParentClass{
	
	ChildClass(){
		
//Compile implicitly adds super() here as the first statement of this constructor.	
		
		System.out.println("Constructor of child class");		
	}
	
	void display(){
		
		System.out.println("Hello!");
	}
	
	ChildClass(int num){
		
//Even though it is a parameterized constructor. The compiler still adds the no-arg super() here
		System.out.println("arg constructor of child class");
	}

	public static void main(String[] args) {
		
//Creating object using default constructor. This will invoke child class constructor, which will invoke parent class constructor
		
		ChildClass cc = new ChildClass();
		cc.display(); //Calling sub class method 
		
//Creating second object using arg constructor. it will invoke arg constructor of child class which will invoke 
//no-arg constructor of parent class automatically 
 
		ChildClass cc1 = new ChildClass(10);
		cc1.display(); //Calling sub class method 

	}

}
