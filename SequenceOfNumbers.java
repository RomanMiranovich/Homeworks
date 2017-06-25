import java.util.Scanner;

public class SequenceOfNumbers {
  public static void main(String[] args) {
    System.out.println("Enter your sequence (use space between numbers):");
    Scanner in = new Scanner(System.in);
    String sequence = in.nextLine();
    String numStr[] = sequence.split(" ");
    int numArr[] = new int [numStr.length];
    try {
      for (int i = 0; i < numStr.length; i++) {
        numArr[i] = Integer.parseInt(numStr[i]);
      }
    } catch (Exception e) {
      System.out.println("You entered a wrong symbol. The program stops working");
      return;
    }
    int lengthArr = numArr.length;
    boolean checkSequence = true;
    for (int i = 0; i + 1 < lengthArr; i++) {
      if (numArr[i] > numArr[i+1]) {
        checkSequence = false;
        System.out.println("Your sequence is not non-decreasing");
        break;
      }
    }   
    if (checkSequence == true) {
        System.out.println("Your sequence is non-decreasing");
    }        
  }
}
