import java.util.Scanner;

public class GrassSeed {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double C = s.nextDouble(); // 0 < C <= 100

        int L = s.nextInt(); // 0 < L <= 100 

        double totalCost = 0.0;

        for (int i = 0; i < L; i++) {
            double w = s.nextDouble(); // real numbers, 0 <= w, l <= 100
            double l = s.nextDouble(); 
            totalCost += (l*w) * C;
        }

        System.out.println(totalCost);
    }
}