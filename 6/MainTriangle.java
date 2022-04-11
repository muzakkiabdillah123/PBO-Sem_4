public class MainTriangle {
        public static void main(String[] args) {
                // Lingkaran 1 (tanpa nilai)
                Triangle myTriangle1 = new Triangle();

                System.out.println(
                                "alas : " + myTriangle1.alas + " tinggi : " + myTriangle1.tinggi + " sisi : "
                                                + myTriangle1.sisi);

                System.out.println("Menampilkan luas segitiga 1: " + myTriangle1.getLuas());

                System.out.println("Menampilkan keliling segitiga 1: " + myTriangle1.getKeliling());

                // Lingkaran 2 (diisi dengan nilai)
                Triangle myTriangle2 = new Triangle(30, 10, 90);

                System.out.println(
                                "alas : " + myTriangle2.alas + " tinggi : " + myTriangle2.tinggi + " sisi : "
                                                + myTriangle2.sisi);

                System.out.println("Menampilkan luas segitiga 2 : " + myTriangle2.getLuas());

                System.out.println("Menampilkan keliling segitiga 2 : " + myTriangle2.getKeliling());

                // Lingkaran 3 (menggunakan set)
                Triangle myTriangle3 = new Triangle();
                myTriangle3.setAlas(20);
                myTriangle3.setTinggi(30);
                myTriangle3.setSisi(60);

                System.out.println(
                                "alas : " + myTriangle3.alas + " tinggi : " + myTriangle3.tinggi + " sisi : "
                                                + myTriangle3.sisi);

                System.out.println("Menampilkan luas segitiga 3 : " + myTriangle3.getLuas());

                System.out.println("Menampilkan keliling segitiga 3 : " + myTriangle3.getKeliling());

        }
}
