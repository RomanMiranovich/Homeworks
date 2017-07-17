import java.util.Scanner;

public class SequenceOfNumbers {

  /**
   * The function is used for determination type of sequence.
   * It may be non-decreasing or do not non-decreasing.
   *
   * @param newArgs - array of String type which contain testing sequence.
   * One elemet of array - one number.
   *
   * @exception NumberFormatException is thrown
   * when user enter wrong data.
   *
   * @return true if sequence is non-decreasing and
   * false if sequence is not non-decreasing.
   */
  public boolean isNonDecreasing(String[] newArgs) {
    for (int i = 0; i + 1 < newArgs.length; i++) {
      if (Integer.parseInt(newArgs[i]) > Integer.parseInt(newArgs[i + 1])) {
        return false;
      }
    }
    return true;
  }

  /**
   * This function is used for checking are the entered numbers a sequence.
   *
   * @param newArgs - array of String type which contain testing sequence.
   * One elemet of array - one number.
   *
   * @return true if was entered several numbers,
   * and false if entered only one number.
   */
  public boolean isOneSymbol(String[] newArgs) {
    return newArgs.length == 1;
  }

  public static void main(String[] args) {
    final String WRONG_SYMBOL = "You entered a wrong symbol. The program stops working";
    final String NOTHING_ARGUMENTS = "You entered nothing arguments with starting program";
    final String ENTER_SEQUENCE = "Enter your sequence now (use space between numbers):";
    final String POSITIVE_ANSWER = "Your sequence is non-decreasing";
    final String NEGATIVE_ANSWER = "Your sequence is not non-decreasing";
    final String SINGLE_SYMBOL = "You entered only one number. It is not a sequence";
    SequenceOfNumbers object = new SequenceOfNumbers();
    boolean checkAnswer = false;
    try {
      if (args.length == 0) {
        System.out.println(NOTHING_ARGUMENTS);
        Scanner in = new Scanner(System.in);
        System.out.println(ENTER_SEQUENCE);
        String sequence = in.nextLine();
        String[] numStr = sequence.split(" ");
        if (!object.isOneSymbol(numStr)) {
          checkAnswer = object.isNonDecreasing(numStr);
        } else {
          System.out.println(SINGLE_SYMBOL);
          return;
        }
      } else {
        if (!object.isOneSymbol(args)) {
          checkAnswer = object.isNonDecreasing(args);
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
