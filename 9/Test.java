public class Test {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c);
        c.setRadius(2.0);
        System.out.println(c);
        System.out.println(c.getArea());
        System.out.println(c.getDiameter());
        System.out.println(c.getPerimeter());
        System.out.println(c.getColor());
        System.out.println(c.toString());
        System.out.println(c.getDateCreated());
        System.out.println();
        Rectangle r = new Rectangle();
        System.out.println(r);
        r.setWidth(2.0);
        r.setHeight(3.0);
        System.out.println(r);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r.getColor());
        System.out.println(r.toString());
        System.out.println(r.getDateCreated());
        System.out.println();
    }
}
