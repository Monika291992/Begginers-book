package StaticKeyword;

public class StaticClass {
	
	static String str ="Monika";
	
	//Static class
	static class mynestedclass{
		
		//non-static method
		void display(){
			
			 /* If you make the str variable of outer class
			    * non-static then you will get compilation error
			    * because: a nested static class cannot access non-
			    * static members of the outer class.
			    */
			
			System.out.println(str);			
		}
	}

	public static void main(String[] args) {
		
		mynestedclass obj = new mynestedclass();
		obj.display();

	}

}
