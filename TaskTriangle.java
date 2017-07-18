import java.util.Scanner;
import java.math.BigDecimal;

public class TaskTriangle {
  public static void main(String[] args) {
    final String WRONG_SYMBOL = "You entered a wrong symbol. The program stops working";
    String a = null;
    String b = null;
    String c = null;
    
    try {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter sides of the triangle (press 'Enter' after every number):");
      a = in.nextLine();
      b = in.nextLine();
      c = in.nextLine();        
      Triangle triangle1 = new Triangle(a, b, c);
      System.out.println(triangle1.checkTriangleType());
    } catch (NumberFormatException e) {
      System.out.println(WRONG_SYMBOL);
    }
  }
}