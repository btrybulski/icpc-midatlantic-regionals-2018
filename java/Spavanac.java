import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hour = s.nextInt();
        int minute = s.nextInt();
        if (minute >= 45) {
            System.out.println(hour + " " + (minute - 45));
        } else {
            int overflow = Math.abs(minute - 45);
            if (hour == 0) {
                System.out.println(23 + " " + (60 - overflow));
            } else {
                System.out.println(hour - 1 + " " + (60 - overflow));
            }
        }
    }
}