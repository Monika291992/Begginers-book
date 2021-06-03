package Encapsulation;
// data can only be accessed by public methods thus making the private fields and their implementation hidden for outside classes. 
//That’s why encapsulation is known as data hiding.

public class EncapsulationDemo {
	
	private int ssn;
	private String name;
	private int age;
	
	//Getter methods
	public void setEmpSSN(int ssn){
		
		this.ssn = ssn;
	}
	public void setEmpName(String name){
		
		this.name = name;
	}
	
	public void setEmpAge(int age){
		
		this.age = age;
	}
	
	//Getter methods
	public int getEmpSSN(){
	
		return ssn;
	}
	public String getEmpname(){
		
		return name;
	}
	public int getEmpAge(){
		
		return age;
	}
	
}
