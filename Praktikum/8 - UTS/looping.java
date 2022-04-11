/*
Buatlah sebuah program yang akan menerima input berupa bilangan bulat A dan menghitung sisa bagi bilangan i terhadap bilangan A. Bilangan i adalah bilangan bulat dari 1 sampai 10.
*/

import java.util.Scanner;

public class looping {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println("Sisa bagi untuk " + i + " adalah " + i % A);
        }
    }
}
