
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        double firstNumber = Double.parseDouble(reader.nextLine());
        
        System.out.print("Type another number: ");
        double secondNumber = Double.parseDouble(reader.nextLine());
        
        double result = firstNumber / secondNumber;
        System.out.println("Division: " + firstNumber + " / " + secondNumber + " = " + result);
        // Implement your program here. Remember to ask the input from user.
    }
}
