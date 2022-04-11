/*
Buatlah sebuah kelas mahasiswa dengan parameter String NIM, String Nama, double IPK - Buat constructor kosong untuk kelas mahasiswa tersebut - Buat constructor yang memberikan nilai untuk parameter NIM, Nama dan IPK - Buat method getter dan setter (accessor dan mutator) untuk setiap parameter tersebut - Buat sebuah method getSmarter untuk membandingkan 2 mahasiswa berdasarkan IPK dan akan mengembalikan objek mahasiswa dengan nilai IPK terbesar - Buat method untuk mencetak semua data objek mahasiswa tersebut dengan urutan NIM, Nama dan IPK yang dipisahkan dengan newline.

Dengan menggunakan class tersebut, didalam fungsi utama akan dibuat N objek mahasiswa. Dipastikan bahwa tidak ada mahasiswa yang memiliki IPK yang sama. Setelah data N objek mahasiswa diinput, selanjutnya program akan menerima input kode lain dengan aturan tertentu.

Ketika inisialisai data ke objek mahasiswa dalam array

Kode 0 program berhenti, tanpa melakukan apapun.
Kode 1 program akan membandingkan 2 mahasiswa berdasarkan NIM, sehingga program selanjutnya akan meminta input 2 NIM. (Dipastikan NIM yang diinput adalah mahasiswa yang sudah dibuat sebagai objek)
Kode 2 program akan mengupdate IPK mahasiswa dengan NIM tertentu sehingga program selanjutnya akan meminta input 1 NIM dan nilai IPK baru.
Kode 3 program akan mencetak semua data mahasiswa secara berurutan dari mahasiswa yang pertama dicreate sampai akhir.
*/

// WRONG ANSWER

import java.util.Scanner;

public class mahasiswa {
    String NIM;
    String Nama;
    double IPK;

    mahasiswa() {
    }

    mahasiswa(String NIM, String Nama, double IPK) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public double getIPK() {
        return IPK;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public mahasiswa GetSmarter(mahasiswa mhs) {
        if (this.IPK > mhs.IPK) {
            return this;
        } else {
            return mhs;
        }
    }

    public void tampilkanData() {
        System.out.println(this.NIM);
        System.out.println(this.Nama);
        System.out.println(this.IPK);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        mahasiswa[] data = new mahasiswa[N];
        // input data
        for (int i = 0; i < N; i++) {
            data[i] = new mahasiswa();
            data[i].setNIM(input.next());
            data[i].setNama(input.next());
            data[i].setIPK(input.nextDouble());
        }

        int kode;
        do {
            kode = input.nextInt();
            if (kode == 1) {
                String nim1 = input.next();
                String nim2 = input.next();
                for (int i = 0; i < N; i++) {
                    if (data[i].getNIM().equals(nim1)) {
                        data[i].GetSmarter(data[i]);
                    } else if (data[i].getNIM().equals(nim2)) {
                        data[i].GetSmarter(data[i]);
                    }
                }
            } else if (kode == 2) {
                String nim = input.next();
                double ipk = input.nextDouble();
                for (int i = 0; i < N; i++) {
                    if (data[i].getNIM().equals(nim)) {
                        data[i].setIPK(ipk);
                    }
                }
            } else if (kode == 3) {

            }

        } while (kode != 0);
        for (int i = 0; i < N; i++) {
            data[i].tampilkanData();
        }
    }
}