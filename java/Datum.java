import java.util.Scanner;

public class Datum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int D = s.nextInt();
        int M = s.nextInt();
        // 1/1/9 was a Thursday
        // 1,8,15,21,...
        int[] dpm = {31,28,31,30,31,30,31,31,30,31,30,31};
        int daysPassed = 0;
        for (int i = 0; i < M-1; i++) {
            daysPassed += dpm[i];
        }
        daysPassed += D;
        String[] days = {"Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday"};
        System.out.println(days[daysPassed % 7]);
    }
}