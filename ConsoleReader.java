import java.util.Scanner;

/**
 * The class is used for entering some sequence of numbers.
 */

class ConsoleReader {
  /** 
   * The function is used for entering sequence
   *
   * @return numStr - array of strings which contain entered sequence. One elemet of array - one number
   */ 
  public String[] enterSequence() {
    final String ENTER_SEQUENCE = "Enter your sequence now (use space between numbers):";
    Scanner in = new Scanner(System.in);
    System.out.println(ENTER_SEQUENCE);
    String sequence = in.nextLine();
    String numStr[] = sequence.split(" ");
    return numStr;
  }
}