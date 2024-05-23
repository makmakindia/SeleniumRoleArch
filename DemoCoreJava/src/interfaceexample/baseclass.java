package interfaceexample;

public class baseclass  implements Parent1, Parent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		baseclass b = new baseclass();
		b.show();

	}

	@Override
	public void show() {
		System.out.println("this is base class show ....!");
		
	}

}
