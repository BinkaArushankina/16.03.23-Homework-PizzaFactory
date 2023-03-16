package pizza_factory;

public abstract class Pizza {
    private String dough;
    public Pizza(String dough) {this.dough = dough;}

    public String getDough() {return dough;}

    public void setDough(String dough) {this.dough = dough;}

    public abstract void preparing();
    public abstract void backing();
    public abstract void packing();
}
