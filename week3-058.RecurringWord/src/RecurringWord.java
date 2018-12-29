
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
       
        String word = "";       //We initialize variables here, because I am bad
        String duplicate = "no";
        
        while(true) {
            if (duplicate .equals("yes")) { //this was unnecessary
                System.out.print("You gave the word " + word);
                System.out.println(" twice");
                break;
            } else {
                System.out.print("Type a word: ");
                word = reader.nextLine();
                if (words.contains(word)) {
                    duplicate = "yes"; //this was unnecessary
                } else { //this was unnecessary
                    words.add(word);
                }
            }
            // Solution could have been:
            // while (true) {
            //     System.out.print("Type a word: ");
            //     String word = reader.nextLine();
            //     if (words.contains(word)) {
            //         System.out.print("You gave the word " + word);
            //         System.out.println(" twice");
            //         break;
            //     }
            //     words.add(word);
            // }
        }
        
    }
}
