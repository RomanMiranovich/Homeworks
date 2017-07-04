import java.util.Scanner;

public class SequenceOfNumbers {
  /** 
   * The function is used for determination type of sequence: non-decreasing or not non-decreasing
   *
   * @param newArgs - array of String type which contain testing sequence. One element of array - one number
   */  
  public String сheckIsSequenceNonDecreasing(String[] newArgs) {
    final String POSITIVE_ANSWER = "Your sequence is non-decreasing";
    final String NEGATIVE_ANSWER = "Your sequence is not non-decreasing";
    
    for (int i = 0; i + 1 < newArgs.length; i++) {
      if (Integer.parseInt(newArgs[i]) > Integer.parseInt(newArgs[i+1])) {
        return NEGATIVE_ANSWER;
      }
    }
    return POSITIVE_ANSWER;
  }
  
  /**
   * The function is used for checking if user entered only one number
   *
   *@param newArgs - array of String type which contain testing sequence. One element of array - one number
   */  
  public boolean checkIsOneSymbol(String[] newArgs) {
    final String SINGLE_SYMBOL = "You entered only one number. It is not a sequence";
    
    if (newArgs.length == 1) {
      System.out.println(SINGLE_SYMBOL);
      return true;
    }
  return false;
  }
    
  public static void main(String[] args) {
    final String WRONG_SYMBOL = "You entered a wrong symbol. The program stops working";
    final String NOTHING_ARGUMENTS = "You entered nothing arguments with starting program";
    final String ENTER_SEQUENCE = "Enter your sequence now (use space between numbers):";
    String answerIsSequenceNonDecreasing = "0";
    
    SequenceOfNumbers object = new SequenceOfNumbers();
    try {
      if (args.length == 0) {
        System.out.println(NOTHING_ARGUMENTS);
        Scanner in = new Scanner(System.in);
        System.out.println(ENTER_SEQUENCE);
        String sequence = in.nextLine();
        String numStr[] = sequence.split(" ");
        if (!object.checkIsOneSymbol(numStr)) {
          answerIsSequenceNonDecreasing = object.сheckIsSequenceNonDecreasing(numStr);
          System.out.println(answerIsSequenceNonDecreasing);
        }
      } else if (!object.checkIsOneSymbol(args)) {
        answerIsSequenceNonDecreasing = object.сheckIsSequenceNonDecreasing(args);
        System.out.println(answerIsSequenceNonDecreasing);
      }
    } catch (Exception e) {
      System.out.println(WRONG_SYMBOL);
    }
  }
}
