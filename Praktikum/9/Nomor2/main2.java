package Nomor2;

public class main2 {
        public static void main(String[] args) {
                Person p1 = new Person("Asep", "Jl. Soekarno Hatta", "08123456789", "asep@gmail.com");

                Student s1 = new Student("Budi", "Jl. Ahmad Yani", "08486360452", "budi@gmail.com", 1);

                Employee e1 = new Employee("Caca", "Jl. Abu lahab", "08354252342", "caca@gmail.com", 01, 4000000);

                Staff s2 = new Staff("Dede", "Jl. Abu Jahal", "08456235623", "dede@gmail.com", 02, 4500000, "S.T");

                Faculty f1 = new Faculty("Eka", "Jl. Ahmad", "08943634232", "eka@gmail.com", 03, 5000000,
                                "09.00 - 17.00", "Ketua Prodi");

                System.out.println(p1.toString());
                System.out.println(" ");
                System.out.println(s1.toString());
                System.out.println(" ");
                System.out.println(e1.toString());
                System.out.println(" ");
                System.out.println(s2.toString());
                System.out.println(" ");
                System.out.println(f1.toString());
        }
}
