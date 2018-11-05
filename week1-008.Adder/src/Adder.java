
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        double firstNumber = Double.parseDouble(reader.nextLine());
        
        System.out.println("Type another number: ");
        double secondNumber = Double.parseDouble(reader.nextLine());
        
        double result = firstNumber + secondNumber;
        System.out.println("Sum of the numbers: " + result);
        
        // Implement your program here. Remember to ask the input from user
    }
}
