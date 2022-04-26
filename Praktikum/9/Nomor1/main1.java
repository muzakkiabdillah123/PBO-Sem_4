package Nomor1;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tiga sisi segitiga : ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        System.out.print("Masukkan warna : ");
        String color = input.next();

        System.out.print("Apakah terisi (true/false) : ");
        boolean isi = input.nextBoolean();

        Triangle t = new Triangle(s1, s2, s3, color, isi);
        System.out.println(t.toString());
        System.out.println("Luas = " + t.getArea());
        System.out.println("Keliling = " + t.getPerimeter());
        System.out.println("Warna = " + t.getColor());
        System.out.println("Apakah terisi = " + t.isFilled());

        input.close();
    }
}