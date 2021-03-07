package apidemo;

public class Dog implements Animal {

	public void eat() {
		System.out.println(" Dog eat pops");
		
	}

	public void run() {
		System.out.println("Dog run fast ");
		
	}

	public void sound() {
		System.out.println("Dog sound gaoo gaoo ");
		
	}

public static void main( String[] agrs) {
	Dog dog=new Dog();
	
	dog.eat();
		
		
	}
	
	

}
