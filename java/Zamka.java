import java.util.Scanner;

public class Zamka {
    static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n = n / 10;
        }
        return sum;
    }

    static void testSumDigits() {
        int a = 10;
        int b = 1000;
        int c = 4225;
        System.out.println(sumDigits(a));
        System.out.println(sumDigits(b));
        System.out.println(sumDigits(c));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int L = s.nextInt(); // 1 <= L <= 10k
        int D = s.nextInt(); // 1 <= D <= 10k
        int X = s.nextInt(); // 1 <= X <= 36

        // Output
        int N = 10000;
        int M = 0;

        for (int i = L; i <= D; i++) {
            if (sumDigits(i) == X) {
                if (i < N) {
                    N = i;
                }
                if (i > M) {
                    M = i;
                }
            }
        }

        System.out.println(N);
        System.out.println(M);
    }
}