import java.util.ArrayList;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> listb) {
        // write code here
        int n = listb.get(0);
        for (int a : listb) {
            if (n < a){
                n = a;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}
