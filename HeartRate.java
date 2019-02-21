import java.util.Scanner;

public class HeartRate {

    static double fourDP(double n) {
        return (double)Math.round(n * 10000d) / 10000d;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt(); // 1 <= N <= 1000
        double[][] output = new double[N][3];
        for (int i = 0; i < N; i++) {
            double b = s.nextDouble();
            double p = s.nextDouble();
            double min = 60.0 / (p / (b-1));
            double max = 60.0 / (p / (b+1));
            double comp = 60.0 * b / p;
            output[i][0] = min;
            output[i][1] = comp;
            output[i][2] = max;
        }

        for (int i = 0; i < N; i++) {
            System.out.println(fourDP(output[i][0]) + " " 
                + fourDP(output[i][1]) + " " + fourDP(output[i][2]));
        }
    }
}