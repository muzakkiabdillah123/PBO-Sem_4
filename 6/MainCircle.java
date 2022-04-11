public class MainCircle {
    public static void main(String[] args) {
        // Memanggil class Circle (Inisialiasi) instance 1
        Circle myCircle1 = new Circle();

        System.out.println("Menampilkan radius lingkaran 1: " + myCircle1.radius);

        System.out.println("Menampilkan luas lingkaran 1: " + myCircle1.getArea());

        System.out.println("Menampilkan keliling lingkaran 1: " + myCircle1.getPerimeter());

        // Memanggil class Circle (Inisialiasi) instance 2
        Circle myCircle2 = new Circle(25); // Jika constructor line 13 di file circle dihapus, maka error

        System.out.println("Menampilkan radius lingkaran 2 : " + myCircle2.radius);

        System.out.println("Menampilkan luas lingkaran 2 : " + myCircle2.getArea());

        System.out.println("Menampilkan keliling lingkaran 2 : " + myCircle2.getPerimeter());

        // Memanggil class Circle (Inisialiasi) instance 3
        Circle myCircle3 = new Circle();
        myCircle3.setRadius(125); // Jika constructor line 13 di file circle dihapus, tidak error

        System.out.println("Menampilkan radius lingkaran 3 : " + myCircle3.radius);

        System.out.println("Menampilkan luas lingkaran 3 : " + myCircle3.getArea());

        System.out.println("Menampilkan keliling lingkaran 3 : " + myCircle3.getPerimeter());

    }
}
