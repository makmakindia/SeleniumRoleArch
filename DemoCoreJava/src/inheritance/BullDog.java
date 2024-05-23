package inheritance;

public class BullDog extends Dog {
	// Animal properties -- Extends --> for both Cat class and Dog class is Hierarchical inheritance
	// multilevel inheritance Animal -- Extends --> Dog -- Extends --> BullDog  properties 
	public static void main(String[] args) {
		
		BullDog obj1=new BullDog();
		obj1.sound();

	}

}
