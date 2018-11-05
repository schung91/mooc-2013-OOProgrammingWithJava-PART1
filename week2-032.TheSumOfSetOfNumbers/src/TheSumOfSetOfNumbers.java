
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         
        System.out.print("Until what? ");
        int n = Integer.parseInt(reader.nextLine());
        
        int result = 0;
        int count = 0;
        while (n >= count) {
            result = result + count;
            count++;
            }
        System.out.println("Sum is " + result);
    }
}
