import java.util.Scanner;

public class SumSquaredDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int P = s.nextInt();
        int[][] O = new int[P][2];

        for (int i = 0; i < P; i++) {
            int K = s.nextInt();
            int b = s.nextInt();
            int n = s.nextInt();
            int res = 0;

            while (n > 0) {
                res = res + (n%b)*(n%b);
                n = n / b;
            }

            O[i][0] = i+1;
            O[i][1] = res;
        }

        for (int i = 0; i < P; i++) {
            System.out.print(O[i][0] + " " + O[i][1]);
            System.out.println();
        }
    }
}