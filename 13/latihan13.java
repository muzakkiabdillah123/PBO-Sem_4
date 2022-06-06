import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class latihan13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int jumlah = input.nextInt();

        try {
            LinkedList<Integer> list = new LinkedList<Integer>();
            for (int i = 0; i < jumlah; i++) {
                try {
                    list.add(input.nextInt());
                } catch (InputMismatchException e) {
                    System.out.println("Yang diinputkan bukan integer");
                }
            }

            System.out.print("[");
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 != 0) {
                    System.out.print((i + 1) + " ");
                }
            }
            System.out.print("]");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}