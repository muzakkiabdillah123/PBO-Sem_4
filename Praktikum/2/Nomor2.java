import java.util.Scanner;

public class Nomor2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("");
        float n = input.nextFloat();
        float fahrenheit = ((9 * n) / 5) + 32;
        System.out.print(fahrenheit);
        input.close();
    }
}
