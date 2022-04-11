import java.util.Scanner;

public class Pert1 {

    public static void main(String[] args) {
        System.out.println("hshshsh");

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Nama: ");
        String nama = sc.nextLine();

        System.out.println("Masukkan Usia: ");
        int usia = sc.nextInt();

        System.out.println("Masukkan IPK: ");
        float ipk = sc.nextFloat();

        System.out.println("Apakah anda senang (true/false): ");
        boolean feel = sc.nextBoolean();

        System.out.println("Namanya adalah " + nama);
        System.out.println("Usia adalah " + usia);
        System.out.println("IPK  adalah " + ipk);

        if (feel == true) {
            System.out.println(nama + " sedang merasa senang");
        } else if (feel == false) {
            System.out.println(nama + " sedang merasa tidak senang");
        }
        sc.close();
    }
}
