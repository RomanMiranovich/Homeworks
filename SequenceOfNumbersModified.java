import java.util.Scanner;

public class SequenceOfNumbersModified {
  /** 
   * The function is used for determination type of sequence: non-decreasing or not non-decreasing
   *
   * @param newArgs - array of strings which contain testing sequence. One elemet of array - one number
   */ 
  public void сheckSequence(String[] newArgs) {
    if (newArgs.length == 1) {
      System.out.println("You entered only one number. It is not a sequence");
      return;
    }

    try {  
      for (int i = 0; i + 1 < newArgs.length; i++) {
        if (Integer.parseInt(newArgs[i]) > Integer.parseInt(newArgs[i+1])) {
          System.out.println("Your sequence is not non-decreasing");
          return;
        }
      }
    } catch (Exception e) {
      System.out.println("You entered a wrong symbol. The program stops working");
      return;
    }
    System.out.println("Your sequence is non-decreasing");
  }
  
  public static void main(String[] args) {
    SequenceOfNumbersModified object = new SequenceOfNumbersModified();
    if (args.length == 0) {
      System.out.println("You entered nothing arguments with starting program");
      Scanner in = new Scanner(System.in);
      System.out.println("Enter your sequence now (use space between numbers):");
      String sequence = in.nextLine();
      String numStr[] = sequence.split(" ");
      object.сheckSequence(numStr);
    } else {
      object.сheckSequence(args);
    }     
  }
}
