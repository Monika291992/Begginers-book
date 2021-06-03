package ThisKeyword;

public class thisReturn {

	public static void main(String[] args) {
		
		thisReturn tr = new thisReturn();
		thisReturn tr1 = tr.display();
		tr1.getname();


	}
	
	public void getname(){
		
		System.out.println("Hello");
	}
	
	public thisReturn display(){ //use class name when we use return this;s 
		
		return this;
		
	}

}
