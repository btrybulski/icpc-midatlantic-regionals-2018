import java.util.Scanner;

public class AmazingHumanCannonball {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        double[][] testCases = new double[N][5];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                testCases[i][j] = s.nextDouble();
            }
        }

        final double g = 9.81;

        // x(t) = v0 * t * cos(theta) 
        // y(t) = v0 * t * sin(theta) - 1/2 * g * t^2, g = 9.81 m/s^2
        // v0 theta x1 h1 h2
        // theta given in degrees
        // safe if vertical margin above and below entry point o wall 
        for (int i = 0; i < N; i++) {
            double v0 = testCases[i][0];
            double theta = testCases[i][1];
            double x1 = testCases[i][2];
            double h1 = testCases[i][3];
            double h2 = testCases[i][4];

            double timeOfFlight = x1 / (v0 * Math.cos(Math.toRadians(theta)));
            double heightAtWall = v0 * timeOfFlight * Math.sin(Math.toRadians(theta)) - 0.5 * g * timeOfFlight * timeOfFlight;

            if (h2 - heightAtWall > 1 && heightAtWall - h1 > 1) {
                System.out.println("Safe");
            } else {
                System.out.println("Not Safe");
            }

        }
    }
}