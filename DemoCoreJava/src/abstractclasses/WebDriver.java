package abstractclasses;

public abstract class WebDriver {

	public abstract void click();
	public abstract void send_keys();
	public abstract void getTitle();
	
	public void concreateMethod() {
		System.out.println("concreateMethod...!");
	}
	

}
