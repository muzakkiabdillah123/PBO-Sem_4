import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LinearEquation3 {
    public static class LinearEquation {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;

        public LinearEquation() {
        }

        public LinearEquation(int a, int b, int c, int d, int e, int f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public int getC() {
            return c;
        }

        public int getD() {
            return d;
        }

        public int getE() {
            return e;
        }

        public int getF() {
            return f;
        }

        public boolean isSolvable() {
            if ((this.a) * (this.d) - (this.b) * (this.c) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public double getX() {
            if (isSolvable()) {
                return ((this.e) * (this.d)) - ((this.b) * (this.f)) / ((this.a) * (this.d) - (this.b) * (this.c));
            } else {
                System.out.print("Persamaan tidak memiliki solusi");
                return 0;
            }
        }

        public double getY() {
            if (isSolvable()) {
                return ((this.a) * (this.f)) - ((this.e) * (this.c)) / ((this.a) * (this.d) - (this.b) * (this.c));
            } else {
                System.out.print("Persamaan tidak memiliki solusi");
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();
        LinearEquation le = new LinearEquation(a, b, c, d, e, f);
        System.out.print("x=" + le.getX());
        System.out.print("\n");
        System.out.print("y=" + le.getY());
        input.close();
    }
}