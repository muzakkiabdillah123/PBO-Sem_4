public class Triangle {
    double alas = 1;
    double tinggi = 1;
    double sisi = 1;

    Triangle() {

    }

    Triangle(double newAlas, double newTinggi, double newSisi) {
        alas = newAlas;
        tinggi = newTinggi;
        sisi = newSisi;
    }

    double getLuas() {
        return (alas * tinggi) / 2;
    }

    double getKeliling() {
        return sisi + sisi + sisi;
    }

    void setAlas(double newAlas) {
        alas = newAlas;
    }

    void setTinggi(double newTinggi) {
        tinggi = newTinggi;
    }

    void setSisi(double newSisi) {
        sisi = newSisi;
    }

}
