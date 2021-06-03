package Abstraction;

//abstract class
public abstract class Sum {
	
//These two are abstract methods, the child class must implement these methods
	
	abstract int SumofTwo(int a, int b);

	abstract int SumofThree(int a, int b, int c);
	
	//Regular method 
	public void getdata(){
		
		System.out.println("Method of class Sum");
		
	}

}
