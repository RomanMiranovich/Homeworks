public class OutputOfNumbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                int n = i / 3;
                System.out.println("3*" + n);
            } else {
                System.out.println(i);
            }		
        }		
    }
}