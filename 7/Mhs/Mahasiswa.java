package Mhs;

public class Mahasiswa {
    private String nama;
    private String nim;
    private int nilai;
    private int usia;

    // Gunakan getter dan setter untuk mengakses private variabel diatas
    public void setNama(String namaBaru) {
        this.nama = namaBaru;
    }

    public String getNama() {
        return nama;
    }

    public void setNIM(String nimBaru) {
        this.nim = nimBaru;
    }

    public String getNIM() {
        return nim;
    }

    public void setNilai(int nilaiBaru) {
        this.nilai = nilaiBaru;
    }

    public int getNilai() {
        return nilai;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int newUsia) {
        this.usia = newUsia;
    }

}