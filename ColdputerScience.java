import java.util.Scanner;

public class ColdputerScience {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            int t = s.nextInt();
            if (t < 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}