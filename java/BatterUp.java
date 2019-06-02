import java.util.Scanner;

public class BatterUp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // number of at-bats
        int walkCount = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int hit = s.nextInt();
            if (hit == -1) {
                walkCount++;
            } else {
                sum += hit;
            }
        }
        System.out.println((double) sum / (n-walkCount));
    }
}