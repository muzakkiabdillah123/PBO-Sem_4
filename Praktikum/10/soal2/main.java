package soal2;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(60, "purple", false);
        Circle circle2 = new Circle(43, "cyan", true);

        System.out.println("\nCircle 1: ");
        System.out.println(circle1);

        System.out.println("\nCircle 2: ");
        System.out.println(circle2);

        System.out.println("\nThe larger of the two circles was ");
        System.out.println(Circle.max(circle1, circle2));

        Rectangle rectangle1 = new Rectangle(20, 14, "yellow", false);
        Rectangle rectangle2 = new Rectangle(18, 16, "black", true);

        System.out.println("\nRectangle 1: ");
        System.out.println(rectangle1);

        System.out.println("\nRectangle 2: ");
        System.out.println(rectangle2);

        System.out.println("\nThe larger of the two rectangles was ");
        System.out.println(Rectangle.max(rectangle1, rectangle2));
    }
}