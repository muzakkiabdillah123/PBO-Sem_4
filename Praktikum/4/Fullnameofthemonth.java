
import java.util.Scanner;

public class Fullnameofthemonth {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String month = input.next();
        int year = input.nextInt();
        int kabisat = year % 4;
        input.close();

        switch (month) {
            case "Jan":
                System.out.println("31 days in January " + year);
                break;
            case "Feb":
                if (kabisat % 4 == 0) {
                    System.out.println("29 days in February " + year);
                } else {
                    System.out.println("28 days in February " + year);
                }
                break;
            case "Mar":
                System.out.println("31 days in March " + year);
                break;
            case "Apr":
                System.out.println("30 days in April " + year);
                break;
            case "May":
                System.out.println("31 days in May " + year);
                break;
            case "Jun":
                System.out.println("30 days in June " + year);
                break;
            case "Jul":
                System.out.println("31 days in July " + year);
                break;
            case "Aug":
                System.out.println("31 days in August " + year);
                break;
            case "Sep":
                System.out.println("30 days in September " + year);
                break;
            case "Oct":
                System.out.println("31 days in October " + year);
                break;
            case "Nov":
                System.out.println("30 days in November " + year);
                break;
            case "Dec":
                System.out.println("31 days in December " + year);
                break;
        }

    }
}
