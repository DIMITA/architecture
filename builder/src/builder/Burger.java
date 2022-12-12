package singleton;

public class Burger {

    private String cuisson;
    private String sauce;
    private Boolean frites;

    private Burger(BurgerBuilder builder) {
        this.cuisson = builder.cuisson;
        this.sauce = builder.sauce;
        this.frites = builder.frites;
    }

    public String getCuisson() {
        return this.cuisson;
    }

    public String getSauce() {
        return this.sauce;
    }

    public String getfrites() {
        return this.frites;
    }

    public static class BurgerBuilder {
        public String cuisson;
        public String sauce;
        public Boolean frites;

        public BurgerBuilder(String cuisson) {
            this.cuisson = cuisson;
        }

        public BurgerBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BurgerBuilder frites(Boolean frites) {
            this.frites = frites;
            return this;
        }

    }
}
