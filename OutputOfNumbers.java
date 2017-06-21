public class OutputOfNumbers {
  public static void main(String[] args) {
    for (int i = 0; i <= 100; i++) {
      if ((i % 3 == 0) && (i % 5 != 0)) {
        System.out.println("Tutti");
      }  
      if ((i % 5 == 0) && (i % 3 != 0)) {
        System.out.println("Frutti");
      } 
      if ((i % 3 == 0) && (i % 5 == 0)) {
        System.out.println("Tutti-Frutti");
      } 
      if ((i % 3 != 0) && (i % 5 != 0)) {
        System.out.println(i);
      }		
    }		
  }
}
