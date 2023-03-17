package pizza_factory;

public class Hawaii extends Pizza {
    private static String TYPE="Pizza Hawaii";
    public Hawaii() {
        super(TYPE);
    }

    protected void preparing() {System.out.println("Preparing Pizza Hawaii with pineapple and cheese");}



}
