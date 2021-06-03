package SuperKeyword;

//Child class or subclass or derived class
public class SubClass extends SuperClass{
	
	//The same variable num is declared in the Subclass which is already present in the Superclass
	int num = 200;
	
	void printNumber(){
		
		System.out.println(num); // prints current class instance variable's value
		System.out.println(super.num); // prints parent class instance variable's value
	}

	public static void main(String[] args) {
		
		SubClass sc = new SubClass();
		sc.printNumber();

	}

}
