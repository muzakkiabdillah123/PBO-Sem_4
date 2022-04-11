package BangunRuang;

public class Triangle {
    public double alas = 1;
    public double tinggi = 1;
    public double sisi = 1;

    public Triangle() {

    }

    public Triangle(double newAlas, double newTinggi, double newSisi) {
        alas = newAlas;
        tinggi = newTinggi;
        sisi = newSisi;
    }

    public double getLuas() {
        return (alas * tinggi) / 2;
    }

    public double getKeliling() {
        return sisi + sisi + sisi;
    }

    public void setAlas(double newAlas) {
        alas = newAlas;
    }

    public void setTinggi(double newTinggi) {
        tinggi = newTinggi;
    }

    public void setSisi(double newSisi) {
        sisi = newSisi;
    }

}
