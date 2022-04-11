import java.util.Scanner;

public class Nomor1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("");

        String kata1 = input.nextLine();
        String kata2 = input.nextLine();
        String kata3 = input.nextLine();

        System.out.print(kata1 + " " + kata2 + " " + kata3 + ".");
        input.close();
    }
}
