import java.util.Scanner;
import java.lang.Math;

public class Areaofhexagon {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        input.close();

        double atas = 6 * (Math.pow(length, 2));
        double bawah = 4 * (Math.tan(Math.PI / 6));

        double area = atas / bawah;

        System.out.printf("%.2f\n", area);

    }
}
