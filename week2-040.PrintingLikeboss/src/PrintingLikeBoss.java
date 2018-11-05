public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int printed = 0;
        while (printed < amount) {
            System.out.print("*");
            printed++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int printed = 0;
        while (printed < amount) {
            System.out.print(" ");
            printed++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int line = 1;
        int space = size - line;
        
        while (line <= size) {
            printWhitespaces(space);
            printStars(line);
            line++;
            space--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int line = 1;
        int space = height - line;
        while (line <= height) {
            printWhitespaces(space);
            printStars(line*2-1);
            line++;
            space--;
        }
        printWhitespaces(height-2);
        printStars(3);
        printWhitespaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
