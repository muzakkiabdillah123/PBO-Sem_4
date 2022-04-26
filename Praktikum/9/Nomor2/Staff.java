package Nomor2;

public class Staff extends Employee {
    private String gelar;

    public Staff() {
    }

    public Staff(String nama, String alamat, String nomorTelepon, String email, int kantor, double gaji, String gelar) {
        super(nama, alamat, nomorTelepon, email, kantor, gaji);
        this.gelar = gelar;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    public String toString() {
        return super.toString() + "\nGelar: " + gelar;
    }
}
