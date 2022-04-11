
import java.util.Scanner;

public class loop1 {

    public static void main(String args[]) {
        int a, i = 0;
        int sum = 0;
        double avg;
        Scanner input = new Scanner(System.in);
        do {
            a = input.nextInt();
            if (a > 0) {
                sum = sum + a;
                i++;
            }
        } while (a != 0 && a >= -100 && a <= 100);
        input.close();
        if (i == 0) {
            i++;
        }

        avg = (double) sum / i;

        System.out.println(sum);
        System.out.printf("%.1f", avg);

    }
}
