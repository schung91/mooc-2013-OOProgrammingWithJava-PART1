
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while (true) {
            System.out.print("Please give a temperature to graph: ");
            double value = Double.parseDouble(reader.nextLine());
            if (value >= -30 && value <= 40) {
                Graph.addNumber(value);
            } else {
                System.out.println("Please input a value between -30 and 40.");
            }
            
            // Graph is used as follows:
            //Graph.addNumber(7);
            //double value = 13.5;
            //Graph.addNumber(value);
            //value = 3;
            //Graph.addNumber(value);
        }
    }
}