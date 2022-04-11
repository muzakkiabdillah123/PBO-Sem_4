public class SegitigaSikuSiku {
    double alas = 1;
    double tinggi = 2;

    SegitigaSikuSiku() {
    }

    SegitigaSikuSiku(double a, double t) {
        alas = a;
        tinggi = t;
    }

    void setAlas(double a) {
        alas = a;
    }

    void setTinggi(double t) {
        tinggi = t;
    }

    double getAlas() {
        return alas;
    }

    double getTinggi() {
        return tinggi;
    }

    double getLuas() {
        return (alas * tinggi) / 2;
    }

    double getMiring() {
        return Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
    }

    double getKeliling() {
        return alas + tinggi + getMiring();
    }
}
