import java.util.Scanner;

public class Nomor3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("");

        int angka = input.nextInt();
        int jumlah = 0;
        while (angka != 0) {
            jumlah = jumlah + angka % 10;
            angka = angka / 10;
        }

        System.out.print(jumlah);
        input.close();

    }
}
