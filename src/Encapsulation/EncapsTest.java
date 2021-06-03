package Encapsulation;

public class EncapsTest {

	public static void main(String[] args) {
		
		EncapsulationDemo ed = new EncapsulationDemo();
		ed.setEmpSSN(112233);
		ed.setEmpName("Mario");
		ed.setEmpAge(33);
		System.out.println("Employee Name: " +ed.getEmpname());
		System.out.println("Employee SSN: " +ed.getEmpSSN());
		System.out.println("Employee Age: " +ed.getEmpAge());

	}

}
