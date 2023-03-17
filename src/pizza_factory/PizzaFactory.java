package pizza_factory;

public class PizzaFactory {
    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case HAWAII:
                return new Hawaii();

            case MOZZARELLA:
                return new Mozarella();

            case SALAMI:
                return new Salami();

            default:
                System.out.println("We dont have this Pizza");
        }
        return null;
    }
}
