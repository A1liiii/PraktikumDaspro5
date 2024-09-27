package meet5;
import java.util.Scanner;

public class Kafe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan menu (kopi/teh/coklat): ");
        String menu = sc.next().toLowerCase(); 
        System.out.print("Masukkan ukuran cup (S/M/L): ");
        char ukuranCup = sc.next().charAt(0);  
        System.out.print("Masukkan jumlah pembelian: ");
        int jumlah = sc.nextInt();
        System.out.print("Apakah Anda anggota? (true/false): ");
        boolean isMember = sc.nextBoolean();

        double hargaMenu = 0;
        switch (menu) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
        }

        double totalHarga = hargaMenu * jumlah;

        switch (ukuranCup) {
            case 'S':
            case 's':
                break;
            case 'M':
            case 'm':
            totalHarga += 0.25 * totalHarga;  
                break;
            case 'L':
            case 'l':
            totalHarga += 0.4 * totalHarga;  
                break;
            default:
                System.out.println("Ukuran cup tidak tersedia.");
                return;
        }

        double diskon = isMember ? 0.10 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga) ;

        System.out.println("\n--- Ringkasan Pembelian ---");
        System.out.println("Menu: " + menu);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Ukuran cup: " + ukuranCup);
        System.out.println("Total harga sebelum diskon: Rp " + totalHarga);
        if (isMember) {
            System.out.println("Diskon anggota: Rp " + diskon*totalHarga);
        }
        System.out.println("Total yang harus dibayar: Rp " + nominalBayar);
    
    }
}
