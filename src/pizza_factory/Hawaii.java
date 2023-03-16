package pizza_factory;

public class Hawaii extends Pizza {
    private String pineapple;
    private String cheese;
    public Hawaii(String dough, String pineapple, String cheese) {
        super(dough);
        this.pineapple = pineapple;
        this.cheese = cheese;
    }
    public String getAnanas() {return pineapple;}
    public void setAnanas(String pineapple) {this.pineapple = pineapple;}
    public String getCheese() {return cheese;}
    public void setCheese(String cheese) {this.cheese = cheese;}
    public void preparing() {System.out.println("Preparing Pizza Hawaii");}
    public void backing() {System.out.println("Backing pizza Hawaii");}
    public void packing() {System.out.println("Packing pizza Hawaii");}

    public String toString() {
        return "You want Pizza Hawaii with " + pineapple +" and "+ cheese;
    }
}
