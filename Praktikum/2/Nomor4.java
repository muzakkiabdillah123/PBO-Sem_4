
import java.util.Scanner;
import java.lang.Math;

public class Nomor4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("");

        double yearlyInterestRate = input.nextDouble();
        int numberOfYears = input.nextInt();
        double loanAmount = input.nextDouble();

        if (yearlyInterestRate > 0 && numberOfYears > 0 && loanAmount > 0) {
            double monthlyInterestRate = yearlyInterestRate / 1200;

            double atas = loanAmount * monthlyInterestRate;

            double bawah = 1 - (1 / (Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));

            double monthlyPayment = atas / bawah;

            double totalPayment = monthlyPayment * numberOfYears * 12;

            System.out.printf("%.2f\n", monthlyPayment);
            System.out.printf("%.2f\n", totalPayment);
            input.close();
        }
    }
}
