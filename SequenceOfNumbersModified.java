import java.util.Scanner;

public class SequenceOfNumbersModified {
  /** 
   * The function is used for determination type of sequence: non-decreasing or not non-decreasing
   *
   * @param newArgs - array of strings which contain testing sequence. One elemet of array - one number
   */ 
  public void сheckSequence(String[] newArgs) {
    final String POSITIVE_ANSWER = "Your sequence is non-decreasing";
    final String NEGATIVE_ANSWER = "Your sequence is not non-decreasing";
    final String WRONG_SYMBOL_ANSWER = "You entered a wrong symbol. The program stops working";
    final String SINGLE_SYMBOL_ANSWER = "You entered only one number. It is not a sequence";
    
    if (newArgs.length == 1) {
      return SINGLE_SYMBOL_ANSWER;
    }

    try {  
      for (int i = 0; i + 1 < newArgs.length; i++) {
        if (Integer.parseInt(newArgs[i]) > Integer.parseInt(newArgs[i+1])) {
          return NEGATIVE_ANSWER;
        }
      }
    } catch (Exception e) {
      return WRONG_SYMBOL_ANSWER;
    }
    return POSITIVE_ANSWER;
  }
  
  public static void main(String[] args) {
    SequenceOfNumbersModified object = new SequenceOfNumbersModified();
    String answer = "0";
    if (args.length == 0) {
      System.out.println("You entered nothing arguments with starting program");
      Scanner in = new Scanner(System.in);
      System.out.println("Enter your sequence now (use space between numbers):");
      String sequence = in.nextLine();
      String numStr[] = sequence.split(" ");
      answer = object.сheckSequence(numStr);
    } else {
      answer = object.сheckSequence(args);
    }
    System.out.println(answer);
  }
}
