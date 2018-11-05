import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers: ");
        int sum = 0;
        int count = 0;
        int entries = 0;
        int even = 0;
        //int odd = 0;
        
        while (true) {
            int n = Integer.parseInt(reader.nextLine());
            
            if (n == -1) {
                break;
            }
            
            sum += n; //this is never executed when you finally input -1 due to the break earlier, thus the code works
            entries++;
            if (n % 2 == 0) {
                even++;
            } //else {
                //odd++;
            //}
            
        }
        //double sum5 = sum;
        //double entries5 = entries;
        //double avg = sum5 / entries5;
        double avg = (double) sum / entries; // commented out my method, added suggested method
        int odd = entries - even;
        
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + entries);
        System.out.println("Average: " + avg);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
