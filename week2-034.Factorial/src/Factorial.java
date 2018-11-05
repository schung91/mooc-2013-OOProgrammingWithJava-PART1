import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        
        int fact = 1;
        int count = 1;
        while (n >= count) {
            fact = fact + fact * count;
            count++;
        }
        System.out.println("Factorial is " + fact);
            
    }
}
