import java.util.Scanner;

public class b {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int Y = input.nextInt();
        int jumlahHari = 0;
        System.out.print("");

        switch (M) {
            case 1:
                jumlahHari = 31;
                break;
            case 2:
                if ((Y % 400 == 0 || (Y % 4 == 0) && (Y % 100 != 0))) {
                    jumlahHari = 29;
                } else {
                    jumlahHari = 28;
                }
                break;
            case 3:
                jumlahHari = 31;
                break;
            case 4:
                jumlahHari = 30;
                ;
                break;
            case 5:
                jumlahHari = 31;
                ;
                break;
            case 6:
                jumlahHari = 30;
                ;
                break;
            case 7:
                jumlahHari = 31;
                ;
                break;
            case 8:
                jumlahHari = 31;
                break;
            case 9:
                jumlahHari = 30;
                break;
            case 10:
                jumlahHari = 31;
                break;
            case 11:
                jumlahHari = 30;
                break;
            case 12:
                jumlahHari = 31;
                break;
        }
        System.out.print(jumlahHari);
        input.close();
    }
}
