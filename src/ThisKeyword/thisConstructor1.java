package ThisKeyword;

public class thisConstructor1 {
	
	thisConstructor1(){
		
		System.out.println("no arg constructor");
	}
	
	thisConstructor1(int a){
		
		this(); // calling no arg constructor
		System.out.println("parameterised constructor");
	}

	public static void main(String[] args) {
		
		thisConstructor1 tc = new thisConstructor1(10);
		
		
	}

}
