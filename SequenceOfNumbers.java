import java.util.Scanner;

public class SequenceOfNumbers {
  public static void main(String[] args) {
    System.out.println("Enter your sequence (use space between numbers):");
    Scanner in = new Scanner(System.in);
    String sequence = in.nextLine();
    String numStr[] = sequence.split(" ");
    
    if (numStr.length == 1) {
      System.out.println("You entered only one number. It is not a sequence");
      return;
    }
    
    try {
      for (int i = 0; i + 1 < numStr.length; i++) {
        if (Integer.parseInt(numStr[i]) > Integer.parseInt(numStr[i+1])) {
          System.out.println("Your sequence is not non-decreasing");
          break;
        } else if (i == numStr.length - 2) {
          System.out.println("Your sequence is non-decreasing");
        }
      }
    } catch (Exception e) {
      System.out.println("You entered a wrong symbol. The program stops working");
      System.exit(0);
    }     
  }
}
