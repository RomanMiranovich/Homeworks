import java.util.Scanner;

public class FibonacciNumbers {
  public static void main(String[] args) {
    int max = 2147483647, num1 = 0, num2 = 1, sum = 0, a = 0;
    boolean ind1 = false, ind2 = false;
    Scanner in = new Scanner (System.in);
    try {
      while (ind1 == false) {
        System.out.println("Enter a number");
        a = in.nextInt();
        if (a < 0) {
          System.out.println("Your number is less than zero. Repeat, please");
        } else {
          ind1 = true;
        }
      }
    } catch (Exception e) {
        System.out.println("You did not enter a number or your number is very large. The program stops working");
        return;       
    }
    while (sum < max * 0.8) {
      sum = num1 + num2;
      if (a == sum) {
        System.out.println("Your number is the Fibonacci number");
        ind2 = true;
        break;
      }
      num1 = num2;
      num2 = sum;
    }
    if (ind2 == false) {
      System.out.println("Your number is not the Fibonacci number");
    }
  }
}