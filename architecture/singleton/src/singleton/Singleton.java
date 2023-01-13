package singleton;

public class Singleton {
	private static Singleton instance;
    int UUID;

    private Singleton(int UUID) {
        this.UUID = UUID;
    }

    public static Singleton getInstance(int value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
