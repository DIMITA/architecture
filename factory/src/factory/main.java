package factory;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone cmdCustomerOne = new SmartphoneFactory().createSmartPhone("iphone");
		SmartPhone cmdCustomerTwo = new SmartphoneFactory().createSmartPhone("huawei");
		System.out.println("The first customer will have "+cmdCustomerOne.getClass());
		System.out.println("The second customer will have "+cmdCustomerTwo.getClass());
	}
	
	
	
}
