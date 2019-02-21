import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        // General formula: numPoints = ((2^N)+1)^2
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int numPoints = (int) Math.pow(Math.pow(2,N)+1, 2);
        System.out.println(numPoints);
    }
}