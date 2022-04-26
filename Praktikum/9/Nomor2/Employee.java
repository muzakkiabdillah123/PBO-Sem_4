package Nomor2;

public class Employee extends Person {
    private int kantor;
    private double gaji;
    private Mydate tanggalKerja;

    public Employee() {
    }

    public Employee(String nama, String alamat, String nomorTelepon, String email, int kantor, double gaji) {
        super(nama, alamat, nomorTelepon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalKerja = new Mydate();
    }

    public int getKantor() {
        return kantor;
    }

    public void setKantor(int kantor) {
        this.kantor = kantor;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public String getTanggalKerja() {
        return tanggalKerja.getMonth() + "/" + tanggalKerja.getDay() + "/" + tanggalKerja.getYear();
    }

    public void setTanggalKerja(Mydate tanggalKerja) {
        this.tanggalKerja = tanggalKerja;
    }

    public String toString() {
        return super.toString() + "\nKantor: " + kantor + "\nGaji: " + gaji + "\nTanggal Kerja: " + getTanggalKerja();
    }
}
