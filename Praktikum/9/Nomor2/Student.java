package Nomor2;

public class Student extends Person {
    private int status;
    public static final int mahasiswaBaru = 1;
    public static final int mahasiswaTahunKedua = 2;
    public static final int junior = 3;
    public static final int senior = 4;

    public Student() {
    }

    public Student(String nama, String alamat, String nomorTelepon, String email, int status) {
        super(nama, alamat, nomorTelepon, email);
        this.status = status;
    }

    public String getStatus() {
        switch (status) {
            case 1:
                return "Mahasiswa Baru";
            case 2:
                return "Mahasiswa Tahun Kedua";
            case 3:
                return "Junior";
            case 4:
                return "Senior";
            default:
                return "Status tidak diketahui";
        }
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String toString() {
        return super.toString() + "\nStatus: " + getStatus();
    }
}
