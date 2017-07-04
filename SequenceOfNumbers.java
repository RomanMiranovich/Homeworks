import java.util.Scanner;
import java.util.Arrays;

public class SequenceOfNumbers {
  public static void main(String[] args) {
    final String WRONG_SYMBOL = "You entered a wrong symbol. The program stops working";
    final String NOTHING_ARGUMENTS = "You entered nothing arguments with starting program";
    final String ENTER_SEQUENCE = "Enter your sequence now (use space between numbers):";
    final String POSITIVE_ANSWER = "Your sequence is non-decreasing";
    final String NEGATIVE_ANSWER = "Your sequence is not non-decreasing";
    final String SINGLE_SYMBOL = "You entered only one number. It is not a sequence";
    String[] numStr;
    
    if (args.length == 0) {
      System.out.println(NOTHING_ARGUMENTS);
      Scanner in = new Scanner(System.in);
      System.out.println(ENTER_SEQUENCE);
      String sequence = in.nextLine();
      numStr = sequence.split(" ");
    } else {
      numStr =  Arrays.copyOf(args, args.length);
    }
    
    if (numStr.length == 1) {
      System.out.println(SINGLE_SYMBOL);
      return;
    }
    
    try {
      for (int i = 0; i + 1 < numStr.length; i++) {
        if (Integer.parseInt(numStr[i]) > Integer.parseInt(numStr[i + 1])) {
          System.out.println(NEGATIVE_ANSWER);
          return;
        }
      }
    } catch (Exception e) {
      System.out.println(WRONG_SYMBOL);
      return;
    }
    System.out.println(POSITIVE_ANSWER);
  }
}
