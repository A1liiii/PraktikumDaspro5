package meet5;
import java.util.Scanner;

public class PemilihanHari15 {
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);
        System.out.print("masukan angka yang akan di convert ke dalam weekday atau weekend : ");
        int daynumber = day.nextInt();

        if (daynumber >= 1 && daynumber <= 5) {
            System.out.println("Angka"+daynumber+"dalam konversi hari adalah weekday");
        } else if (daynumber == 6 || daynumber == 7) {
            System.out.println("Angka"+daynumber+"dalam konversi hari adalah weekend");
        } else {
            System.out.println("Invalid Number");
        }

        day.close();

    }
}
