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

        System.out.println("We have 3 Pizzas: Mozzarella, Salami, Hawaii");
        System.out.println("What Pizza would you like to order?");
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();

        switch (choose) {
            case "HAWAII":
                Pizza hawaii = new Hawaii("white","pineapple","cheese");
                System.out.println(hawaii);
                hawaii.preparing();
                hawaii.backing();
                hawaii.packing();
                break;
            case "MOZZARELLA":
                Pizza mozzarella = new Mozarella("white","mozzarella");
                System.out.println(mozzarella);
                mozzarella.preparing();
                mozzarella.backing();
                mozzarella.packing();
                break;
            case "SALAMI":
                Pizza salami = new Salami("white","salami");
                System.out.println(salami);
                salami.preparing();
                salami.backing();
                salami.packing();
                break;
            default:
                System.out.println("we don't have this pizza");
        }

    }
    /*
We have 3 Pizzas: Mozzarella, Salami, Hawaii
What Pizza would you like to order?
MOZZARELLA
You want pizza Mozzarella with mozzarella
Preparing Pizza Mozzarella
Backing pizza Mozzarella
Packing pizza Mozzarella

     */
    /*
We have 3 Pizzas: Mozzarella, Salami, Hawaii
What Pizza would you like to order?
SALAMI
You want pizza Salami with salami
Preparing Pizza Salami
Backing pizza Salami
Packing pizza Salami
     */
    /*
We have 3 Pizzas: Mozzarella, Salami, Hawaii
What Pizza would you like to order?
HAWAII
You want Pizza Hawaii with pineapple and cheese
Preparing Pizza Hawaii
Backing pizza Hawaii
Packing pizza Hawaii
     */
    /*
We have 3 Pizzas: Mozzarella, Salami, Hawaii
What Pizza would you like to order?
BECON
we don't have this pizza
     */
}