package factory;

public class Iphone implements SmartPhone {

	public boolean call() {
		return true;
	}
	
	public boolean installApp() {
		return false;
	}
}
