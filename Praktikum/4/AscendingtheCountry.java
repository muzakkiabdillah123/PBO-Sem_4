import java.text.*;
import java.util.*;

public class AscendingtheCountry {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String kata[] = new String[n];

        for (int i = 0; i < n; i++) {
            kata[i] = input.next();
        }

        Arrays.sort(kata, Collator.getInstance());
        for (String c : kata) {
            System.out.println(c);
        }
        input.close();
    }
}
