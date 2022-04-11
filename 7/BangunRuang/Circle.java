package BangunRuang;

// Nama class
public class Circle {
    // Properties
    public double radius = 1;

    // Constrcutor (bisa ada bisa tidak) (agar bisa tidak masukin nilai, dengan
    // adanya constructor line 13)
    public Circle() {

    }

    // Constructor a circle object (agar bisa masukin nilai)
    public Circle(double newRadius) {
        radius = newRadius;
    }

    // Methods (HARUS ADA)
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    // Method Void = tidak ada return
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
}