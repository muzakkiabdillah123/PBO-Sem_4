import Mhs.Mahasiswa;

public class main_Mhs {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Budi");
        mhs.setNIM("2008765");
        mhs.setNilai(90);
        mhs.setUsia(8);

        System.out.println("Nama Mhs : " + mhs.getNama());
        System.out.println("NIM      : " + mhs.getNIM());
        System.out.println("Nilai    : " + mhs.getNilai());
        System.out.println("Usia     : " + mhs.getUsia());
    }
}
