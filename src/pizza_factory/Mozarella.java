package pizza_factory;

public  class Mozarella extends Pizza {
    private String mozarellaCheese;
    public Mozarella(String dough, String mozarellaCheese) {
        super(dough);
        this.mozarellaCheese=mozarellaCheese;
    }
    public String getMozarellaCheese() {return mozarellaCheese;}
    public void setMozarellaCheese(String mozarellaCheese) {this.mozarellaCheese = mozarellaCheese;}
    public  void preparing() {System.out.println("Preparing Pizza Mozzarella");}
    public  void backing() {System.out.println("Backing pizza Mozzarella");}
    public  void packing() {System.out.println("Packing pizza Mozzarella");}

    public String toString(){
        return "You want pizza Mozzarella with "+mozarellaCheese;
    }

}
