// GANTI ARRAY JADI TIPE DATA LIST

import Association.Course;
import Association.Student;
import Association.Faculty;

public class main {
    public static void main(String[] args) {
        Student s1 = new Student("Asep", "2000532", new Course[0]);
        Student s2 = new Student("Budi", "2000533", new Course[0]);
        Student s3 = new Student("Caca", "2000534", new Course[0]);
        Student s4 = new Student("Deni", "2000535", new Course[0]);

        Faculty f1 = new Faculty("Prof Asep", 1, new Course[0]);
        Faculty f2 = new Faculty("Prof Budi", 2, new Course[0]);

        Course c1 = new Course("Algoritma", 1, new Student[0], f1);
        Course c2 = new Course("Pemrograman", 2, new Student[0], f2);
        Course c3 = new Course("Ilkom", 200, new Student[0], f1);
        Course c4 = new Course("Fisika", 201, new Student[0], f1);

        s1.addCourse(c1);
        s1.addCourse(c2);
        s2.addCourse(c2);
        s2.addCourse(c3);
        s3.addCourse(c3);
        s3.addCourse(c4);
        s4.addCourse(c4);

        System.out.println("Nama : " + s1.getNama());
        System.out.println("NIM : " + s1.getNim());
        System.out.println("Mata Kuliah : ");
        System.out.println(s1.getCourse(0).getNameCourse());
        System.out.println(s1.getCourse(1).getNameCourse());
        System.out.println("");

        System.out.println("Nama : " + s2.getNama());
        System.out.println("NIM : " + s2.getNim());
        System.out.println("Mata Kuliah : ");
        System.out.println(s2.getCourse(0).getNameCourse());
        System.out.println(s2.getCourse(1).getNameCourse());
        System.out.println("");

        System.out.println("Nama : " + s3.getNama());
        System.out.println("NIM : " + s3.getNim());
        System.out.println("Mata Kuliah : ");
        System.out.println(s3.getCourse(0).getNameCourse());
        System.out.println(s3.getCourse(1).getNameCourse());
        System.out.println("");

        System.out.println("Nama : " + s4.getNama());
        System.out.println("NIM : " + s4.getNim());
        System.out.println("Mata Kuliah : ");
        System.out.println(s4.getCourse(0).getNameCourse());
        System.out.println("");
    }
}
