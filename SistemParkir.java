package meet5;

import java.util.Scanner;

public class SistemParkir {
    public static void main(String[] args) {
        // Step 1: Persiapan Variabel
        String jenis_kendaraan;
        int biaya_per_jam = 0;
        int durasi;
        int total_biaya;

        // Step 2: Input dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jenis kendaraan (mobil/motor): ");
        jenis_kendaraan = input.nextLine();

        // Step 3: Percabangan untuk cek jenis kendaraan
        if (jenis_kendaraan.equalsIgnoreCase("mobil")) {
            biaya_per_jam = 5000; // Jika kendaraan adalah mobil, biaya per jam 5000
        } else if (jenis_kendaraan.equalsIgnoreCase("motor")) {
            biaya_per_jam = 3000; // Jika kendaraan adalah motor, biaya per jam 3000
        } else {
            System.out.println("Jenis kendaraan tidak valid!");
            return; 
        }

        System.out.println("Masukkan durasi parkir (jam): ");
        durasi = input.nextInt();

        

        // Step 4: Hitung total biaya
        total_biaya = durasi * biaya_per_jam;

        // Step 5: Tampilkan hasil
        System.out.println("Jenis kendaraan: " + jenis_kendaraan);
        System.out.println("Total biaya parkir: Rp " + total_biaya);
    }
}

