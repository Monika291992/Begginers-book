package Objects;

public class CallByValue {
	
	public void callbyvalue(int a){
		
		a = 100;
	}

	public static void main(String[] args) {
		
		int a = 50;
		CallByValue cv = new CallByValue();
		cv.callbyvalue(a);
		System.out.println(a);

	}

}
