import java.util.Scanner;

public class c {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = 0;
        int c;
        int temp = a;
        while (a > 0) {
            c = a % 10;
            b = b * 10 + c;
            a = a / 10;
        }
        if (temp == b && b > 9) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not Palindrome");
        }
        input.close();
    }
}
