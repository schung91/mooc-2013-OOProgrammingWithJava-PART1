
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        
        int power = 0;
        int count = 0;
        while (n >= count) {
            int result = (int)Math.pow(2, count);
            power = power + result;
            
            count++;
        }
        
        System.out.println("The result is " + power);
    }
}
