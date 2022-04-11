class Person {
    protected String fname = "John";
    protected String lname = "Doe";
    protected String email = "asep@gmail.com";
}

final class Vehicle {
    protected String brand = "Toyota";
    protected String model = "Corolla";
    protected String color = "Red";
}

public class extend extends Person {

    public static void main(String[] args) {
        Person jelema = new Person();
        System.out.println("Nama saya : " + jelema.fname);

        Vehicle tes = new Vehicle();
        System.out.println("Mobil ini jelek : " + tes.brand);
    }
}