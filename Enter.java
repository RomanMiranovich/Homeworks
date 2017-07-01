import java.util.Scanner;

class Enter {
  /** 
   * The function is used for entering sequence
   *
   * @return numStr - array of strings which contain entered sequence. One elemet of array - one number
   */ 
  public String[] enterSequence() {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your sequence now (use space between numbers):");
    String sequence = in.nextLine();
    String numStr[] = sequence.split(" ");
    return numStr;
  }
}