package myjava1;
abstract class Animal{
	abstract String s();
	}

class Dog extends Animal{
	 String s() {
		 return "White";
		 }
}

class Cat extends Animal{
	String s() {
		return "Black";
	}
}


public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
				Animal A;
				A= new Dog();
				System.out.println("Dog color is: "+ A.s());
				A = new Cat();
				System.out.println("Cat color is: "+ A.s());
		}	
	}

