package Abstraction;

//Demo class extends abstract class
public class Demo extends Sum{
	
//If I don't provide the implementation of these two methods, the program will throw compilation error.	
	
	@Override
	int SumofTwo(int a, int b) {
		
		return a+b;
	}

	@Override
	int SumofThree(int a, int b, int c) {
		
		return a+b+c;
	}

	public static void main(String[] args) {
		
		Sum s = new Demo();
		System.out.println(s.SumofTwo(5, 8));
		System.out.println(s.SumofThree(2, 6, 9));

	}

}
