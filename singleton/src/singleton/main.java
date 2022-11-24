package singleton;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Singleton Implementation!");
        
        Singleton singleton = Singleton.getInstance(1);
        Singleton anotherSingleton = Singleton.getInstance(3);
        System.out.println(singleton.UUID);
        System.out.println(anotherSingleton.UUID);

	}

}
