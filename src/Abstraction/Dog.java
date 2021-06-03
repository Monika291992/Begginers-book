package Abstraction;

//Dog class extends Animal class
public class Dog extends Animal {

	public static void main(String[] args) {

//Here by casting instance of Dog type to Animal reference, we are hiding the complexity of Dog type under Animal. 
//Now the Animal reference can be used to provide the implementation but it will hide the actual implementation process.
              Animal an = new Dog(); 
              an.sound();
	}

	@Override
	void sound() {
		
		System.out.println("woof");
		
	}

}
