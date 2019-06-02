import java.util.ArrayList;
import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> output = new ArrayList<>();

        int setSize = s.nextInt();
        int totalDist = 0;
        while (setSize != -1) {
            int lastDist = 0;
            for (int i = 0; i < setSize; i++) {
                int speed = s.nextInt();
                int dist = s.nextInt();
                totalDist += (dist - lastDist) * speed;
                lastDist = dist;
            }
            output.add(totalDist);
            totalDist = 0;
            setSize = s.nextInt();
        }

        for (Integer i : output) {
            System.out.println(i + " miles");
        }
        s.close();
    }
}