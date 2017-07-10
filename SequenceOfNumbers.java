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

  /**
   * This function is used for checking
   * is the sequence a non-decreasing or not non-decreasing.
   * The function can works even if you entered only one number.
   *
   * @param newArgs - array of String type which contain testing sequence.
   * One elemet of array - one number.
   *
   * @return Int number with information about sequence:
   * 1 - sequence is not non-decreasing;
   * 2 - sequence is non-decreasing;
   * 3 - entered only one number
   */
  public int isNonDecreasingImproved(String[] newArgs) {
    SequenceOfNumbers object = new SequenceOfNumbers();
    if (!object.isOneSymbol(newArgs)) {
      if (!object.isNonDecreasing(newArgs)) {
        return 1;
      } else {
        return 2;
      }
    } else {
      return 3;
    }
  }

  public static void main(String[] args) {
    final String WRONG_SYMBOL = "You entered a wrong symbol. The program stops working";
    final String NOTHING_ARGUMENTS = "You entered nothing arguments with starting program";
    final String ENTER_SEQUENCE = "Enter your sequence now (use space between numbers):";
    final String POSITIVE_ANSWER = "Your sequence is non-decreasing";
    final String NEGATIVE_ANSWER = "Your sequence is not non-decreasing";
    final String SINGLE_SYMBOL = "You entered only one number. It is not a sequence";
    SequenceOfNumbers object = new SequenceOfNumbers();
    int checkAnswer = 0;

    try {
      if (args.length == 0) {
        System.out.println(NOTHING_ARGUMENTS);
        Scanner in = new Scanner(System.in);
        System.out.println(ENTER_SEQUENCE);
        String sequence = in.nextLine();
        String[] numStr = sequence.split(" ");
        checkAnswer = object.isNonDecreasingImproved(numStr);
      } else {
        checkAnswer = object.isNonDecreasingImproved(args);
      }
      if (checkAnswer == 1) {
        System.out.println(NEGATIVE_ANSWER);
      } else if (checkAnswer == 2) {
        System.out.println(POSITIVE_ANSWER);
      } else if (checkAnswer == 3) {
        System.out.println(SINGLE_SYMBOL);
      }
    } catch (NumberFormatException e) {
      System.out.println(WRONG_SYMBOL);
    }
  }
}
