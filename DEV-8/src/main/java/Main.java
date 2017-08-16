/*WARNING!
All this project is a very big peace of shitcode
but I can't understand how to solve this task by
more convenient method.
I hope that you can help me to find the right way
on this road...
*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final String TYPE = "Enter type of product:";
    final String NAME = "Enter name of product:";
    final String AMOUNT = "Enter amount of product:";
    final String COST = "Enter cost of unit of product:";
    final String COUNT_TYPES = "count types";
    final String COUNT_ALL = "count all";
    final String AVERAGE_PRICE = "average price";
    final String EXIT = "exit";
    //todo smart menu with list of available commands
    String type;
    String name;
    int amount;
    double cost;

    Scanner in1 = new Scanner(System.in);

    System.out.println(TYPE);
    type = in1.nextLine();
    System.out.println(NAME);
    name = in1.nextLine();
    System.out.println(AMOUNT);
    amount = in1.nextInt();
    System.out.println(COST);
    cost = in1.nextDouble();

    Product prod1 = new Product(type, name, amount, cost);

    Scanner in2 = new Scanner(System.in);

    System.out.println(TYPE);
    type = in2.nextLine();
    System.out.println(NAME);
    name = in2.nextLine();
    System.out.println(AMOUNT);
    amount = in2.nextInt();
    System.out.println(COST);
    cost = in2.nextDouble();

    Product prod2 = new Product(type, name, amount, cost);

    Scanner in3 = new Scanner(System.in);

    System.out.println(TYPE);
    type = in3.nextLine();
    System.out.println(NAME);
    name = in3.nextLine();
    System.out.println(AMOUNT);
    amount = in3.nextInt();
    System.out.println(COST);
    cost = in3.nextDouble();

    Product prod3 = new Product(type, name, amount, cost);

    Scanner in4 = new Scanner(System.in);

    System.out.println(TYPE);
    type = in4.nextLine();
    System.out.println(NAME);
    name = in4.nextLine();
    System.out.println(AMOUNT);
    amount = in4.nextInt();
    System.out.println(COST);
    cost = in4.nextDouble();

    Product prod4 = new Product(type, name, amount, cost);

    String order = null;
    String typeForFunction = null;
    double result = 0;
    Scanner in5 = new Scanner(System.in);

    while(true) {
      System.out.println("Enter your command:");
      order = in5.nextLine();
      if (order.equals(COUNT_TYPES)) {
        result = Product.countTypes();
      } else if (order.equals(COUNT_ALL)) {
        result = Product.countAll();
      } else if(order.equals(AVERAGE_PRICE)) {
        result = Product.averagePrice();
      } else if(order.equals(EXIT)) {
        return;
      } else {
        typeForFunction = order.substring(14);
        result = Product.averagePriceType(typeForFunction);
      }
      System.out.println(result);
    }
  }
}
