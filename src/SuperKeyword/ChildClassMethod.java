package SuperKeyword;

public class ChildClassMethod extends ParentMethod{
	
	//Overriding method
	   void display(){
		System.out.println("Child class method");
	   }
	   void printMsg(){
		//This would call Overriding method
		display();
		//This would call Overridden method
		super.display();
	   }

	public static void main(String[] args) {

		ChildClassMethod obj= new ChildClassMethod();
		obj.printMsg(); 

	}

}
