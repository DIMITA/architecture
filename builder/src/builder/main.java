package singleton;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Buider Implementation!");
        
        Burger burger = new Burger.BurgerBuilder("à point")
            .frites(true)
            .sauce("barberk");
        System.out.println(burger);

	}

}
