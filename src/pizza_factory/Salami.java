package pizza_factory;

public class Salami extends Pizza {
    private static String TYPE="Pizza Salami";
    public Salami() {
        super(TYPE);
    }

    protected void preparing() {System.out.println("Preparing Pizza with salami, cheese and tomatoes");}



}
