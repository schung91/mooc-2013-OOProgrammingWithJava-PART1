import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        words.add(word);
        
        while(true) {
            if (word.isEmpty()) {
                Collections.reverse(words);
                System.out.println("You typed the following words:");
                for (String printWord : words) {
                    System.out.println( printWord );
                }
                break;
            } else {
                System.out.print("Type a word: ");
                word = reader.nextLine();
                words.add(word);
            }
        }
    }
}
