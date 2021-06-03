package Objects;

public class ObjRefVariable {
	
	//Object Initialization using Reference variable
	
	String name;
	int age;
	int rollno;

	public static void main(String[] args) {
		
		ObjRefVariable obj = new ObjRefVariable();
		
//if we don’t initialized values of class fields then they are initialized with their default values.
		
		// Accessing and property value
		obj.name = "Tanisha"; 
		obj.age = 20;
		obj.rollno = 37787;
		
		// Calling method
		obj.info();

	}
	
	void info(){
		
		System.out.println("Name is " +name);
		System.out.println("Age is " +age);
		System.out.println("Rollno is " +rollno);
	}

}
