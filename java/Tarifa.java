import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int X = s.nextInt(); // 1 <= X <= 100
        int N = s.nextInt(); // 1 <= N <= 100
        int totalUsage = 0;
        for (int i = 0; i < N; i++) {
            int monthlyUsage = s.nextInt();
            totalUsage += monthlyUsage;
        }
        System.out.println((N+1)*X - totalUsage);
    }
}