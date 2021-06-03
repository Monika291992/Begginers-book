package StaticKeyword;

class NestedClass { //outer class
	
	//static int d =10;
	static void display(){
		
		System.out.println(1);
	}
	public static void main(String[] args) {
		
	//	System.out.println(InnerClass.d); //static variable belongs to the class not to the object
		 display();
	}		
}

/*class Demo(){
	
	static void show(){
		
		System.out.println(2);
	}		
}*/



