package pizza_factory;

public  class Mozarella extends Pizza {
    private static String TYPE="Pizza Mozzarella";
    public Mozarella() {
        super(TYPE);

    }
    protected void preparing() {System.out.println("Preparing Pizza with Mozzarella cheese");}




}
