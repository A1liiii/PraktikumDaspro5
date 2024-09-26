package meet5;

import java.util.Scanner;

public class CekUsia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usia = -1;

        while (usia < 0) {
            System.out.println("Masukkan usia Anda: ");

            if (input.hasNextInt()) {
                usia = input.nextInt();
                if (usia < 0) {
                    System.out.println("Input tidak valid! Usia harus berupa angka positif.");
                }
            } else {
                System.out.println("Input tidak valid! Harap masukkan angka positif.");
                input.next();
            }
        }

        if (usia >= 0 && usia <= 12) {
            System.out.println("Kategori usia: Anak");
        } else if (usia >= 13 && usia <= 19) {
            System.out.println("Kategori usia: Remaja");
        } else if (usia >= 20 && usia <= 64) {
            System.out.println("Kategori usia: Dewasa");
        } else if (usia >= 65) {
            System.out.println("Kategori usia: Lansia");
        }
    }
}

