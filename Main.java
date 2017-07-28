import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    final String INSERT = "Array after inserting of element: ";
    final String ARRAY = "Your array: ";
    final String DELETE =  "Array after deleting of element: ";
    final String ADD = "Array after adding of element: ";
    Scanner in = new Scanner(System.in);
    String strArray;
    try {
      System.out.println("Enter size of array");
      int size = in.nextInt();
      VariableArray arr = new VariableArray(size);

      arr.addElement(105);
      strArray = arr.outArray();
      System.out.println(ADD + strArray);

      arr.insertElement(99, 0);
      strArray = arr.outArray();
      System.out.println(INSERT + strArray);

      arr.addElement(1010);
      strArray = arr.outArray();
      System.out.println(ADD + strArray);

      arr.deleteElement(1);
      strArray = arr.outArray();
      System.out.println(DELETE + strArray);

      System.out.println(arr.getElement(0));

      System.out.println(arr.getElement(arr.getSize() - 1));

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("You entered a wrong index. The program stops working.");
    } catch (NegativeArraySizeException e) {
      System.out.println("You entered a wrong size of array. The program stops working.");
    } catch (InputMismatchException e) {
      System.out.println("You entered a wrong symbol. The program stops working.");
    }
  }
}
