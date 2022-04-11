import java.util.Scanner;
import java.util.Arrays;

public class DefineAnagram {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String kata1 = input.nextLine();
        String kata2 = input.nextLine();

        boolean status = true;
        if (kata1.length() != kata2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = kata1.toLowerCase().toCharArray();
            char[] ArrayS2 = kata2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }

        if (status) {
            System.out.print("anagram");
        } else {
            System.out.print("not anagram");
        }
        input.close();

    }
}
