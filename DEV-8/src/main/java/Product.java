import java.util.ArrayList;
import java.util.List;

/**
 * The class is used for containing
 * parameters of product and manipulating
 * with it.
 */

//todo tests for functions

public class Product {
  private static int countOfCreatedObjects = 0;
  private static List<String> typeList = new ArrayList();
  private static List<String> nameList = new ArrayList();
  private static List<Integer> amountList = new ArrayList();
  private static List<Double> costList = new ArrayList();

  /**
   * This constructor is used for creating object
   * with known parameters.
   * @param type - type of product.
   * @param name - name of product.
   * @param amount - amount of products with this name.
   * @param cost - cost one unit of product.
   */
  Product(String type, String name, int amount, double cost) {
    typeList.add(type);
    nameList.add(name);
    amountList.add(amount);
    costList.add(cost);
    countOfCreatedObjects++;
    //todo throwing IllegalArgumentException
  }

  /**
   * This function is used for counting all
   * created different types.
   * @return number of different types.
   */
  public static int countTypes() {
    int countOfTypes = 0;
    boolean flag = false;
    for (int i = 0; i < countOfCreatedObjects; i++) {
      flag = false;
      for (int j = 0; j < i; j++) {
        if (typeList.get(i).equals(typeList.get(j))) {
          flag = true;
        }
      }
      if(!flag) {
        countOfTypes++;
      }
    }
    return countOfTypes;
  }

  /**
   * This function is used for counting all
   * units of product.
   * @return number of all products.
   */

  public static int countAll() {
    int countAll = 0;
    for (int i = 0; i < countOfCreatedObjects; i++) {
      countAll += amountList.get(i);
    }
    return countAll;
  }

  /**
   * This function is used for counting average
   * price of all product units.
   * @return average price.
   */
  public static double averagePrice() {
    double allCost = 0;
    for (int i = 0; i < countOfCreatedObjects; i++) {
      allCost += amountList.get(i) * costList.get(i);
    }
    return allCost/countOfCreatedObjects;
  }

  /**
   * This function is used for counting average
   * price of products with specific type.
   * @param type - products with this type
   *             will be count.
   * @return average price.
   */
  public static double averagePriceType(String type) {
    //todo throwing some exception when incoming type is not exist
    int countOfCoincidence = 0;
    double allCost = 0;
    for (int i = 0; i < countOfCreatedObjects; i++) {
      if (type.equals(typeList.get(i))) {
        allCost += amountList.get(i) * costList.get(i);
        countOfCoincidence++;
      }
    }
    return allCost/countOfCoincidence;
  }
}
