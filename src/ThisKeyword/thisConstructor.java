package ThisKeyword;
//we are calling a parameterized constructor from the non-parameterized constructor using the this keyword along with argument.
public class thisConstructor {

	//We can call a constructor from inside the another function by using this keyword
	thisConstructor (){
		
		this("Hello");		// calling parameterized constructor	
	}
	
	thisConstructor(String str){
		
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
		thisConstructor tc = new thisConstructor();

	}

}
