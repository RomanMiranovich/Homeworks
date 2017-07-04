public class SequenceOfNumbers {
  /** 
   * The function is used for determination type of sequence: non-decreasing or not non-decreasing
   *
   * @param newArgs - array of String type which contain testing sequence. One elemet of array - one number
   */  
  public boolean сheckSequenceIsNonDecreasing(String[] newArgs) {
    final String SINGLE_SYMBOL = "You entered only one number. It is not a sequence";
    final String WRONG_SYMBOL = "You entered a wrong symbol. The program stops working"; 
    try {
      if (newArgs.length == 1) {
        throw new IllegalArgumentException();
      }
      for (int i = 0; i + 1 < newArgs.length; i++) {
        if (Integer.parseInt(newArgs[i]) > Integer.parseInt(newArgs[i + 1])) {
          return false;
        }
      }
    } catch (NumberFormatException e) {
      System.out.println(WRONG_SYMBOL);
      System.exit(13);
    } catch (IllegalArgumentException e) {
      System.out.println(SINGLE_SYMBOL);
      System.exit(13);
    }
    return true;
  }

  public static void main(String[] args) {
    final String WRONG_SYMBOL = "You entered a wrong symbol. The program stops working";
    final String NOTHING_ARGUMENTS = "You entered nothing arguments with starting program";
    final String ENTER_SEQUENCE = "Enter your sequence now (use space between numbers):";
    final String POSITIVE_ANSWER = "Your sequence is non-decreasing";
    final String NEGATIVE_ANSWER = "Your sequence is not non-decreasing";
    SequenceOfNumbers object = new SequenceOfNumbers();
    boolean checkAnswer = false;

    if (args.length == 0) {
      System.out.println(NOTHING_ARGUMENTS);
      Scanner in = new Scanner(System.in);
      System.out.println(ENTER_SEQUENCE);
      String sequence = in.nextLine();
      String[] numStr = sequence.split(" ");
      checkAnswer = object.сheckSequenceIsNonDecreasing(numStr);
    } else {
      checkAnswer = object.сheckSequenceIsNonDecreasing(args);
    }

    if (checkAnswer) {
      System.out.println(POSITIVE_ANSWER);
    } else {
      System.out.println(NEGATIVE_ANSWER);
    }
  }
}
