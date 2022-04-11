public class PersegiPanjang {
    double panjang = 1;
    double lebar = 1;

    PersegiPanjang() {
    }

    PersegiPanjang(double p, double l) {
        panjang = p;
        lebar = l;
    }

    void setPanjang(double p) {
        panjang = p;
    }

    void setLebar(double l) {
        lebar = l;
    }

    double getPanjang() {
        return panjang;
    }

    double getLebar() {
        return lebar;
    }

    double getLuas() {
        return panjang * lebar;
    }

    double getKeliling() {
        return 2 * (panjang + lebar);
    }
}
