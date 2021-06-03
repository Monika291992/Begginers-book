package Interfaces;

//A class can implement any number of interfaces.
//Interfaces supports Multiple Inheritance
//public class InterfaceWithInheritance implements Inf3, Inf2
public class InterfaceWithInheritance implements Inf3{

//Even though this class is only implementing the interface Inf2, it has to implement all the methods of Inf1 as well because the interface Inf2 extends Inf1

@Override
public void method1() {
	
	System.out.println("method1");
}
//If there are two or more same methods in two interfaces and a class implements both interfaces, implementation of the method once is enough.

@Override
public void method2() { //Int1 and Int2 have same name method2

	System.out.println("method2");
}

@Override

public void method3() {
	System.out.println("method3");
	
}

public static void main(String[] args) {
	
       Inf3 obj = new InterfaceWithInheritance();
       obj.method1();
       obj.method2();
       obj.method3();

// 6) reference to x is ambiguous both variables are x in class Inf1 and Inf2 so we are using interface name to resolve the variable

      System.out.println(Inf1.x);
      System.out.println(Inf2.x);

}




}
