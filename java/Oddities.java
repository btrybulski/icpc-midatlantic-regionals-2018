import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for (int i = 0; i < N; i++) {
            int val = s.nextInt();
            if (Math.abs(val) % 2 == 0) {
                System.out.println(val + " is even");
            } else {
                System.out.println(val + " is odd");
            }
        }
    }
}