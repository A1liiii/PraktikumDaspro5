package meet5;
import java.util.Scanner;

public class PemilihanBilangan15 {
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);
        System.out.print("masukan hari (dalam bahasa inggris ) : ");
        String dayname = day.nextLine().toLowerCase();

        String daytype;

        switch (dayname) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                daytype = "Weekday";
                break;
            case "saturday":
            case "sunday":
                daytype = "Weekend";
                break;
            default:
                daytype = "Invalid";
                break;
        }

        System.out.println("hari "+dayname+" adalah "+daytype+".");

        day.close();

    }
}
