
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        while (true) {
            System.out.print("Type the password: ");
            String userpw = reader.nextLine();
        
            if (userpw.equals(password)) {
                System.out.println("Right!\n\nThe secret is: wewlad!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
