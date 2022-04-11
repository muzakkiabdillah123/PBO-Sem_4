
// Wrong Answer
import java.util.Scanner;

public class methodSayHelloori {
    public static void Say() {
        System.out.print("Hai Kamu");
    }

    public static void Say(String a) {
        System.out.print("Hai " + a + "!");
    }

    public static void Say(int b, String a) {
        for (int i = 0; i < b; i++) {
            System.out.print("Hai " + a + "!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        int b = input.nextInt();
        Say(b, a);
        input.close();

    }
}
