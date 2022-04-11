/*
Buatlah sebuah kelas Binatang yang memiliki parameter jenis, dan warna. - Buatlah constructor kosong - Buatlah constructor untuk mengisi parameter binatang tersebut. - Buat method getter dan setter dari kelas tersebut - Buatlah method aktifitas pada binatang tersebut

Fungsi utama akan menerima input data 1 objek binatang tertentu dan sebuah kode.

Kode 1 artinya program akan mencetak bahwa binatang sedang diam
Kode 2 artinya program akan mencetak bahwa binatang sedang beraktifitas, sehingga ketika program menerima input 2, user harus memasukan string aktifitas yang dilakukan.
*/

import java.util.Scanner;

public class Binatang {
    String jenis;
    String warna;

    public Binatang() {
    }

    public Binatang(String jenis, String warna) {
        this.jenis = jenis;
        this.warna = warna;
    }

    public String getJenis() {
        return jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void aktifitas() {
        System.out.println(jenis + " sedang diam");
    }

    public void aktifitas(String A) {
        System.out.println(jenis + " sedang " + A.toLowerCase());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenis = input.nextLine();
        String warna = input.nextLine();
        int jumlah = input.nextInt();
        Binatang binatang = new Binatang();
        binatang.setJenis(jenis);
        binatang.setWarna(warna);
        if (jumlah == 1) {
            binatang.aktifitas();
        } else if (jumlah == 2) {
            String aktifitas = input.next();
            binatang.aktifitas(aktifitas);
        }
    }
}
