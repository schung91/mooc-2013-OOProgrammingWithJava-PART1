
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        int remainderby4 = year % 4;
        int remainderby100 = year % 100;
        int remainderby400 = year % 400;
        if ((remainderby4 == 0 && remainderby100 != 0) || (remainderby100 == 0 && remainderby400 == 0)) {
            System.out.println("The year is a leap year.");
        } 
        else {
            System.out.println("The year is not a leap year.");
        }
    }
}