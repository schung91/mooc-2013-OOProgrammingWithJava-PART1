
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int i = text.length() -1;   //Characters in a string start at at an index of 0. Therefore the last character of the String "text" will be found with .length() -1
        String reversal = "";
        while (i >= 0) {
            char character = text.charAt(i);
            reversal = reversal + character;
            i--;
        }
        return reversal;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
