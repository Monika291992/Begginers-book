package Objects;

public class Callbyvalue1 {
	
	int x;
	int y;
	
	Callbyvalue1(int a, int b){
		
		x = a;
		y = b;
	}

	public static void main(String[] args) {
	       
		Callbyvalue1 cv = new Callbyvalue1(5, 10); // call parameterized constructor
		increment(cv.x, cv.y); // call static method
		System.out.println("x= " +cv.x);
		System.out.println("y= " +cv.y);

	}
	
	static void increment(int x, int y){
		
		x++;
	//	y+s+;
	}

}
