import java.util.Scanner;

public class MethodSumDigit {

    // the sum of the digits that make up a number
    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        System.out.print(sumDigits(n));
        input.close();
    }
}