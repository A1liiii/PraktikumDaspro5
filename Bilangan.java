package meet5;
import java.util.Scanner;
public class Bilangan {
    public static void main(String[] args) {
        Scanner bil = new Scanner(System.in);
        System.out.println("sistem pengecekan bilangan");
        System.out.print("masukkan angka : ");
        int angka = bil.nextInt();

        if (angka % 2 == 0) {
            System.out.println("angka "+angka+" adalah genap");
        } else {
            System.out.println("angka "+angka+" adalah ganjil");
        }
    }
}
