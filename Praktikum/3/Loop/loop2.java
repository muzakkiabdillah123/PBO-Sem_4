import java.util.Scanner;

public class loop2 {

    public static void main(String args[]) {
        int i;
        float hasil;
        Scanner angka = new Scanner(System.in);

        // N:Bilangan bulat
        // M:Bilangan desimal
        int n = angka.nextInt();
        float m = angka.nextFloat();

        for (i = 0; i < n; i++) {
            hasil = (float) ((m + i) * 2.2);
            System.out.printf("%.2f %.2f\n", (m + i), hasil);
        }
        input.close();
    }
}
