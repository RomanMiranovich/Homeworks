public class CheckingSequenceMain {        
  public static void main(String[] args) {
    Check objectCheck = new Check();
    Enter objectEnter = new Enter();
    String answer = "0";
    if (args.length == 0) {
      System.out.println("You entered nothing arguments with starting program");
      String[] enteredLaterArgs = objectEnter.enterSequence();
      answer = objectCheck.ñheckSequence(enteredLaterArgs);
    } else {
      answer = objectCheck.ñheckSequence(args);
    }
    System.out.println(answer);
  }
}