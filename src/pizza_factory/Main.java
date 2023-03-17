package pizza_factory;

import java.util.Scanner;

public class Main {
    /*
Создать фабрику по производству пиццы. Фабрика должна уметь готовить следуюшие виды пиццы.
Гавайи, Мацарелла, Салями.
2. Кажлый вид пиццы должен уметь подготавливаться: (накладывать ингридиенты напр.),
печься и упаковываться.
В каждом случае должно быть понятно о какой пицце речь
3. В классе Main не должен создаваться новый обьект пиццы а из него должен поступать заказ на
изготовление требуемого вида пиццы (Обьекта) в класс PizzaFactory, который и должен выбрать
нужную пиццу для изготовления

Пример заказа пицца Hawaii.
На выходе
Preparing pizza with ananas and cheese  Подготовка пиццы с ананасами и сыром
Baking Pizza Hawaii  Выпекание пиццы
Packing pizza Hawaii  упаковка пиццы
 */


    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();

        String salami = "SALAMI";
        PizzaType pizzaType = PizzaType.valueOf(salami);//peredelat stroku w enum dlja switch
        Pizza pizzaSalami = factory.createPizza(pizzaType);
        pizzaSalami.orderPizza();
        System.out.println("_______________________________________________________________");
        String hawaii = "HAWAII";
        PizzaType pizzaType1 = PizzaType.valueOf(hawaii);
        Pizza pizzaHawaii = factory.createPizza(pizzaType1);
        pizzaHawaii.orderPizza();
        System.out.println("________________________________________________________________");
        String mozzarella = "MOZZARELLA";
        PizzaType pizzaType2 = PizzaType.valueOf(mozzarella);
        Pizza pizzaMozzarella = factory.createPizza(pizzaType2);
        pizzaMozzarella.orderPizza();


   /*
Preparing Pizza with salami, cheese and tomatoes
Backing Pizza Salami
Packing Pizza Salami
_______________________________________________________________
Preparing Pizza Hawaii with pineapple and cheese
Backing Pizza Hawaii
Packing Pizza Hawaii
________________________________________________________________
Preparing Pizza with Mozzarella cheese
Backing Pizza Mozzarella
Packing Pizza Mozzarella
    */


        System.out.println("----------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        do{
            PizzaType pizzaTypeScanner=null;
            boolean flag;
            do {
                flag=false;
                System.out.println("We have three pizza types. Enter the following:");
                System.out.println("SALAMI for Pizza Salami");
                System.out.println("HAWAII for Pizza Hawaii");
                System.out.println("MOZZARELLA for Pizza Mozzarella");

                String pizzaChoice = scanner.nextLine();
                try {
                    pizzaTypeScanner = PizzaType.valueOf(pizzaChoice.toUpperCase());
                } catch (IllegalArgumentException exception) {
                    System.out.println("Please make a valid choice");
                    flag=true;
                }
            }while (flag);//flag true  poka flag true zikl budet prodolschatsa, a kogda wwedut prawilno eto false i loop ende
            Pizza newPizza = factory.createPizza(pizzaTypeScanner);
            newPizza.orderPizza();

            System.out.println("Do you want to order another pizza? press no if not or any key if yes");
        }while(!scanner.nextLine().equalsIgnoreCase("no"));// poka ne naschal no prodolschaem zikl
        System.out.println("Thank you for your order. Enjoy the pizza");
    }



}