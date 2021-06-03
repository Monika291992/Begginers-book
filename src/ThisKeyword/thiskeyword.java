package ThisKeyword;

public class thiskeyword {
	
	double width, height, depth;
	
	//the argument passed while calling the constructor.
	
	thiskeyword (double a, double b, double c){ //Parameterized Constructor
			
		this.width = a;
		this.height = b;
		this.depth = c;
	}
	
	

	public static void main(String[] args) {
		
		thiskeyword tk = new thiskeyword(10,20,30);
		System.out.println("width is " +tk.width);
		System.out.println("height is " +tk.height);
		System.out.println("depth is " +tk.depth);
	}

}
