package factory;

public class SmartphoneFactory {
	
	public SmartPhone createSmartPhone(String marque) {
		
		switch (marque) {
		case "iphone": {
			return new Iphone();
		}
		case "huawei": {
			return new Huawei();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + marque);
		}
	}
	
}
