// Nama class
class Circle {
    // Properties (HARUS ADA)
    double radius = 1;

    // Constrcutor (bisa ada bisa tidak) (agar bisa tidak masukin nilai, dengan
    // adanya constructor line 13)
    Circle() {

    }

    // Constructor a circle object (agar bisa masukin nilai)
    Circle(double newRadius) {
        radius = newRadius;
    }

    // Methods (HARUS ADA)
    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    // Method Void = tidak ada return
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}