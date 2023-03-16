package pizza_factory;

public class Salami extends Pizza {
    private String salami;
    public Salami(String dough, String salami) {
        super(dough);
        this.salami = salami;
    }
    public String getSalami() {return salami;}
    public void setSalami(String salami) {this.salami = salami;}
    public void preparing() {System.out.println("Preparing Pizza Salami");}
    public void backing() {System.out.println("Backing pizza Salami");}
    public void packing() {System.out.println("Packing pizza Salami");}

    public String toString(){
        return "You want pizza Salami with "+salami;
    }
}
