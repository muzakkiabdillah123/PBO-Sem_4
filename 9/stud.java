class college {
    public void move() {
        System.out.println("college is open");
    }
}

class univ extends college {
    public void move() {
        System.out.println("univ is open too");
    }
}

public class stud {
    public static void main(String[] args) {
        college a = new college();
        college b = new univ();
        a.move();
        b.move();
    }
}
