import java.util.Scanner;

public class IntegerPolindrom {

    // return the reversal of an integer
    public static int reverse(int number) {
        int rev = 0;
        while (number > 0) {
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        return rev;
    }

    // return true if number is a polindrom
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.print("Polindrome");
        } else {
            System.out.print("Is not Polindrome");
        }
        input.close();

    }
}
