package superclassdemo;

public class Dog extends Animal {
	
	public void sound() {
		super.sound();
		System.out.println("Dog Sound ....!");
	}

	public static void main(String[] args) {
		
//		Dog d = new Dog();
		Animal d = new Dog();
		d.sound();
		

	}

}
