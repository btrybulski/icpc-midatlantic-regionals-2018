import java.util.Scanner;

public class FreeFood {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt(); // 1 <= N <= 100
        int[] eventDays = new int[366];
        for (int i = 0; i < 366; i++) {
            eventDays[i] = 0;
        }

        for (int i = 0; i < N; i++) {
            int si = s.nextInt();
            int ti = s.nextInt();
            for (int j = si; j <= ti; j++) {
                eventDays[j] = 1;
            }
        }

        int sum = 0;
        for (int i = 0; i < 366; i++) {
            sum += eventDays[i];
        }

        System.out.println(sum);
    }
}