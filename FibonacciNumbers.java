import java.util.Scanner;

public class FibonacciNumbers {
  public static void main(String[] args) {
    int num1 = 0;
    int num2 = 1; 
    int sum = 0;
    int user_number = 0;
    boolean check_number = false;
    Scanner in = new Scanner (System.in);
    try {
      System.out.println("Enter a number");
      user_number = in.nextInt();
      if (user_number < 0) {
        System.out.println("Your number is less than zero. The program stops working");
        return;
      }
    } catch (Exception e) {
        System.out.println("You did not enter a number or your number is very large. The program stops working");
        return;       
    }
    while (sum < Integer.MAX_VALUE * 0.8) {
      sum = num1 + num2;
      if (user_number == sum) {
        System.out.println("Your number is the Fibonacci number");
        check_number = true;
        break;
      }
      num1 = num2;
      num2 = sum;
    }
    if (!check_number) {
      System.out.println("Your number is not the Fibonacci number");
    }
  }
}
