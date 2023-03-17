package pizza_factory;

public abstract class Pizza {
    private String type;
    public Pizza(String type) {this.type = type;}
    public void orderPizza(){
        preparing();
        backing();
        packing();
    }
    protected abstract void preparing();
    private void backing(){
        System.out.println("Backing "+type);
    }
    private void packing(){
        System.out.println("Packing "+type);
    }
}
