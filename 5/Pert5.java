public class Pert5 {
    // print string as much as nilai
    public static void cetak_pesan(String pesan, int nilai) {
        for (int i = 0; i < nilai; i++) {
            System.out.println(pesan);
        }
    }

    // sum of all the numbers from x to y
    public static int sum(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 10;
        int q = sum(x, y);
        // print q
        System.out.println(q);

        // pass by parameter
        cetak_pesan("Hello World", 5);

        // pass by value
        int z = 5;
        cetak_pesan("Hello World", z);
    }
}
