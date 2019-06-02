import java.util.Scanner;

public class LastFactorialDigit {
    static int lastFactorialDigit(int n) {
        int f = 1;
        for (int i = n; i > 0; i--) 
            f = f * i;
        return f % 10;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt(); // 1 <= T <= 10
        int[] inputs = new int[T];
        for (int i = 0; i < T; i++) {
            int N = s.nextInt(); // 1 <= N <= 10
            inputs[i] = N;
        }
        for (int i = 0; i < T; i++) {
            System.out.println(lastFactorialDigit(inputs[i]));
        }
    }
}