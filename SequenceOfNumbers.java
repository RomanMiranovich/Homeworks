import java.util.Scanner;

public class SequenceOfNumbers {

  /**
   * The function is used for determination type of sequence.
   * It may be non-decreasing or not non-decreasing.
   *
   * @param newArgs - array of String type which contain testing sequence.
   * One elemet of array - one number.
   */
  public boolean сheckSequenceIsNonDecreasing(String[] newArgs) {
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
  public boolean checkIsOneSymbol(String[] newArgs) {
    return newArgs.length == 1;
  }

  /**
   * This function is used for checking sequence
   * if it contains one number and is the sequence a 
   * non-decreasing or not non-decreasing.
   *
   * @param newArgs - array of String type which contain testing sequence.
   * One elemet of array - one number.
   * 
   * @return string with information about sequence.
   *
   * @exception NumberFormatException is thrown
   * when user enter wrong data.
   */
  public String checkIsOneSymbolAndIsSequenceNonDecreasing(String[] newArgs) {
    final String POSITIVE_ANSWER = "Your sequence is non-decreasing";
    final String NEGATIVE_ANSWER = "Your sequence is not non-decreasing";
    final String SINGLE_SYMBOL = "You entered only one number. It is not a sequence";
    SequenceOfNumbers object = new SequenceOfNumbers();
    if (!object.checkIsOneSymbol(newArgs)) {
      if (!object.сheckSequenceIsNonDecreasing(newArgs)) {
        return NEGATIVE_ANSWER;
      } else {
        return POSITIVE_ANSWER;
      }
    } else {
      return SINGLE_SYMBOL;
    }
  }

  public static void main(String[] args) {
    final String WRONG_SYMBOL = "You entered a wrong symbol. The program stops working";
    final String NOTHING_ARGUMENTS = "You entered nothing arguments with starting program";
    final String ENTER_SEQUENCE = "Enter your sequence now (use space between numbers):";
    SequenceOfNumbers object = new SequenceOfNumbers();
    String checkAnswer;

    try {
      if (args.length == 0) {
        System.out.println(NOTHING_ARGUMENTS);
        Scanner in = new Scanner(System.in);
        System.out.println(ENTER_SEQUENCE);
        String sequence = in.nextLine();
        String[] numStr = sequence.split(" ");
        checkAnswer = object.checkIsOneSymbolAndIsSequenceNonDecreasing(numStr);
      } else {
        checkAnswer = object.checkIsOneSymbolAndIsSequenceNonDecreasing(args);
      }
      System.out.println(checkAnswer);
    } catch (NumberFormatException e) {
      System.out.println(WRONG_SYMBOL);
    }
  }
}
