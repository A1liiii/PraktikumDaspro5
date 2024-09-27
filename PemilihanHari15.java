package meet5;
import java.util.Scanner;

public class PemilihanHari15 {
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);
        System.out.print("Masukkan nama hari (dalam bahasa Inggris): ");
        String dayName = day.next().toLowerCase();

        String dayType;
        switch (dayName) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "Weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "Weekend";
                break;
            default:
                dayType = "Invalid";
                break;
        }
        System.out.println("Hari " + dayName + " adalah " + dayType + ".");

    }
}
