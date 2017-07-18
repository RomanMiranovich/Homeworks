import java.util.Scanner;

public class SequenceOfNumbers {
  public static void main(String[] args) {
    final String WRONG_SYMBOL = "You entered a wrong symbol. The program stops working.";
    final String NOTHING_ARGUMENTS = "You entered nothing arguments with starting program.";
    final String POSITIVE_ANSWER = "Your sequence is non-decreasing.";
    final String NEGATIVE_ANSWER = "Your sequence is not non-decreasing.";
    final String SINGLE_SYMBOL = "You entered only one number. It is not a sequence.";
    Checker checker = new Checker();
    ConsoleReader input = new ConsoleReader();
    boolean checkAnswer = false;
    try {
      if (args.length == 0) {
        System.out.println(NOTHING_ARGUMENTS);        
        String[] numStr = input.enterSequence();
        if (!checker.isOneSymbol(numStr)) {       
          checkAnswer = checker.isNonDecreasing(numStr);
        } else {
          System.out.println(SINGLE_SYMBOL);
          return;
        }
      } else {
        if (!checker.isOneSymbol(args)) {
          checkAnswer = checker.isNonDecreasing(args);
        } else {
          System.out.println(SINGLE_SYMBOL);
          return;
        }
      }
      if (checkAnswer) {
        System.out.println(POSITIVE_ANSWER);
      } else {
        System.out.println(NEGATIVE_ANSWER);
      } 
    } catch (NumberFormatException e) {
      System.out.println(WRONG_SYMBOL);
    }
  }
}